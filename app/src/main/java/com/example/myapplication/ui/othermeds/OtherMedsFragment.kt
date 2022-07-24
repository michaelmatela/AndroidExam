package com.example.myapplication.ui.othermeds

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentOtherMedicationsBinding

class OtherMedsFragment : Fragment() {

    private var otherMedsViewModel: OtherMedsViewModel? = null
    private var binding: FragmentOtherMedicationsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        otherMedsViewModel = ViewModelProvider(this)[OtherMedsViewModel::class.java]
        binding = FragmentOtherMedicationsBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}