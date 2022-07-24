package com.example.myapplication.ui.medications.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.myapplication.ui.othermeds.OtherMedsFragment
import com.example.myapplication.ui.preventions.PreventionsFragment
import com.example.myapplication.ui.reliever.RelieverFragment

class TabAdapter(fm: FragmentManager?, var mNumOfTabs: Int) :
    FragmentStatePagerAdapter(fm!!) {
    override fun getCount(): Int {
        return mNumOfTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                RelieverFragment()
            }
            1 -> {
                PreventionsFragment()
            }
            2 -> {
                OtherMedsFragment()
            }
            else -> RelieverFragment()
        }
    }
}