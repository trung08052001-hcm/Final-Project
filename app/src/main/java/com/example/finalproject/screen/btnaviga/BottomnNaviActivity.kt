package com.example.finalproject.screen.btnaviga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.finalproject.R
import com.example.finalproject.screen.Forgotpassword.ForgotPasswordActivity
import com.example.finalproject.screen.Login.LoginActivity
import com.example.finalproject.screen.Otp.OtpActivity
import com.example.finalproject.screen.profile.ProfileActivity
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class BottomnNaviActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottomn_navi)
        val bottomNavigationView: ChipNavigationBar = findViewById(R.id.bottom)
        val navController = supportFragmentManager.findFragmentById(R.id.nav_host_container)?.let {
            NavHostFragment.findNavController(it)
        }
        bottomNavigationView.setOnItemSelectedListener { id ->
            val intent: Intent
            when (id) {
                R.id.home -> {
                    intent = Intent(this@BottomnNaviActivity, OtpActivity::class.java)
                    startActivity(intent)
                }
                R.id.search -> {
                    intent = Intent(this@BottomnNaviActivity, ForgotPasswordActivity::class.java)
                    startActivity(intent)
                }
                R.id.mess -> {
                    intent = Intent(this@BottomnNaviActivity, LoginActivity::class.java)
                    startActivity(intent)
                }
                R.id.profile -> {
                    intent = Intent(this@BottomnNaviActivity, ProfileActivity::class.java)
                    startActivity(intent)
                }
                else -> {
                }
            }
        }
    }
}
//val fragmentManager = supportFragmentManager
//val fragmentTransaction = fragmentManager.beginTransaction()
//
//when (id) {
//    R.id.nav_home -> {
//        val homeFragment = HomeFragment()
//        fragmentTransaction.replace(R.id.fragment_container, homeFragment)
//    }
//    R.id.nav_search -> {
//        val searchFragment = SearchFragment()
//        fragmentTransaction.replace(R.id.fragment_container, searchFragment)
//    }
//    R.id.nav_mess -> {
//        val messFragment = MessFragment()
//        fragmentTransaction.replace(R.id.fragment_container, messFragment)
//    }
//    R.id.nav_profile -> {
//        val profileFragment = ProfileFragment()
//        fragmentTransaction.replace(R.id.fragment_container, profileFragment)
//    }
//}
//
//fragmentTransaction.commit()
//Ở đây, R.id.fragment_container là ID của một FrameLay