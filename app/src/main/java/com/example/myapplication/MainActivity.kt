package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.log_event.LogDialog

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        setupNavigationBar()
        setupBottomSheetButton()
    }

    fun setupBottomSheetButton() {
        binding?.logButton?.setOnClickListener{
            val bottomSheet = LogDialog()
            bottomSheet.show(
                supportFragmentManager,
                "ModalBottomSheet"
            )
        }
    }

    fun setupNavigationBar() {
        val appBarConfiguration: AppBarConfiguration = AppBarConfiguration.Builder(R.id.navigation_today, R.id.navigation_medication)
            .build()
        val navController = findNavController(this, R.id.nav_host_fragment_activity_main)
        setupActionBarWithNavController(this, navController, appBarConfiguration)
        setupWithNavController(binding!!.navView, navController)
    }
}