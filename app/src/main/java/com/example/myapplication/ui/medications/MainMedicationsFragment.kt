package com.example.myapplication.ui.medications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainMedicationsBinding
import com.example.myapplication.ui.medications.adapters.TabAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener

class MainMedicationsFragment : Fragment() {
    private var homeViewModel: MainMedicationsViewModel? = null
    private var binding: FragmentMainMedicationsBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(MainMedicationsViewModel::class.java)
        binding = FragmentMainMedicationsBinding.inflate(inflater, container, false)
        val root: View = binding!!.getRoot()
        setupWindow()
        setupTabs()
        return root
    }

    fun setupWindow() {
        val window = activity!!.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.white)
    }

    fun setupTabs() {
        val tabLayout = binding?.tabLayout
        tabLayout?.addTab(tabLayout.newTab().setText("Relievers"))
        tabLayout?.addTab(tabLayout.newTab().setText("Preventers"))
        tabLayout?.addTab(tabLayout.newTab().setText("Other Meds"))
        tabLayout?.tabGravity = TabLayout.GRAVITY_FILL
        val viewPager = binding?.viewPager
        val tabsAdapter =
            tabLayout?.tabCount?.let { TabAdapter(childFragmentManager, it) }
        viewPager?.adapter = tabsAdapter
        viewPager?.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
        tabLayout?.setOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager?.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}