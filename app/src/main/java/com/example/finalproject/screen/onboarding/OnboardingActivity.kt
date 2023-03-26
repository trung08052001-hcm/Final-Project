package com.example.finalproject.screen.onboarding

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.finalproject.R
import com.ramotion.paperonboarding.PaperOnboardingFragment
import com.ramotion.paperonboarding.PaperOnboardingPage

class OnboardingActivity : AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        fragmentManager = supportFragmentManager
        val paperOnboardingFragment = PaperOnboardingFragment.newInstance(getDataForOnBoarding())
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_container, paperOnboardingFragment)
        fragmentTransaction.commit()
    }
    private fun getDataForOnBoarding(): ArrayList<PaperOnboardingPage> {
        val src1 = PaperOnboardingPage("hotel",
            "all hoterl and hostels are",
            Color.parseColor("#ffb174"),
            R.drawable.facebook,
            R.drawable.google)
        val src2 = PaperOnboardingPage("12312",
            "all hoterl 13123123123 hostels are",
            Color.parseColor("#ffb174"),
            R.drawable.google,
            R.drawable.facebook)
        val src3 = PaperOnboardingPage(
            "67",
            "all hoterl and 323232323 are",
            Color.parseColor("#ffb174"),
            R.drawable.facebook,
            R.drawable.facebook
        )
        val elements = ArrayList<PaperOnboardingPage>()
        elements.add(src1)
        elements.add(src2)
        elements.add(src3)
        return elements
    }
}