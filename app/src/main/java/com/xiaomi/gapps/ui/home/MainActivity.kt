 package com.xiaomi.gapps.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.xiaomi.gapps.R
import com.xiaomi.gapps.databinding.ActivityAuthBinding
import com.xiaomi.gapps.databinding.ActivityMainBinding
import com.xiaomi.gapps.ui.auth.AuthActivity
import com.xiaomi.gapps.ui.auth.GAppsAuth

 class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener{
            GAppsAuth.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}