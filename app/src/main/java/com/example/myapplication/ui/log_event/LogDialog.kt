package com.example.myapplication.ui.log_event

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class LogDialog : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.dialog_log,
            container, false
        )
    }

    override fun getTheme(): Int {
        return R.style.CustomBottomSheetDialog
    }
}