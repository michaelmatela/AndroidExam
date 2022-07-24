package com.example.myapplication.ui.reliever

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentRelieversBinding

class RelieverFragment : Fragment() {

    private var relieverViewModel: RelieverViewModel? = null
    private var binding: FragmentRelieversBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        relieverViewModel = ViewModelProvider(this)[RelieverViewModel::class.java]
        binding = FragmentRelieversBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}