package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.example.finalproject.databinding.FragmentBottomNavigationBinding


//class BottomNavigationFragment : Fragment() {
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val binding = FragmentBottomNavigationBinding.inflate(inflater, container, false)
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        val navController = childFragmentManager.findFragmentById(R.id.nav_host_container)?.let {
//            NavHostFragment.findNavController(it)
//        }
//
//        binding.bottom.setOnItemSelectedListener { id ->
//            when (id) {
//                R.id.nav_home -> {
////                    val homeFragment = HomeFragment()
//                    com.example.finalproject.screen.btnaviga.fragmentTransaction.replace(R.id.fragment_container, homeFragment)
//                }
//                R.id.nav_search -> {
//                    val searchFragment = SearchFragment()
//                    com.example.finalproject.screen.btnaviga.fragmentTransaction.replace(R.id.fragment_container, searchFragment)
//                }
//                R.id.nav_mess -> {
//                    val messFragment = MessFragment()
//                    com.example.finalproject.screen.btnaviga.fragmentTransaction.replace(R.id.fragment_container, messFragment)
//                }
//                R.id.nav_profile -> {
//                    val profileFragment = ProfileFragment()
//                    com.example.finalproject.screen.btnaviga.fragmentTransaction.replace(R.id.fragment_container, profileFragment)
//                }
//            }
//        }
//
//        return binding.root
//    }
//}


