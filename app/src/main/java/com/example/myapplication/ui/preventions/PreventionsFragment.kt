package com.example.myapplication.ui.preventions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentPreventionsBinding

class PreventionsFragment : Fragment() {

    private var preventionsViewModel: PreventionsViewModel? = null
    private var binding: FragmentPreventionsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        preventionsViewModel = ViewModelProvider(this)[PreventionsViewModel::class.java]
        binding = FragmentPreventionsBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}