package com.example.finalproject

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ramotion.paperonboarding.PaperOnboardingFragment
import com.ramotion.paperonboarding.PaperOnboardingPage

class onboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_onboarding, container, false)
        val fragmentManager = childFragmentManager
        val paperOnboardingFragment = PaperOnboardingFragment.newInstance(getDataForOnBoarding())
        val fragmentTransaction = fragmentManager.beginTransaction()
        paperOnboardingFragment.setOnRightOutListener {
//            findNavController().navigate(R.id.action_onboardingFragment_to_wellcomeFragment)
        }
        fragmentTransaction.add(R.id.fragment_container, paperOnboardingFragment)
        fragmentTransaction.commit()
        return rootView
    }

    private fun getDataForOnBoarding(): ArrayList<PaperOnboardingPage> {
        val src1 = PaperOnboardingPage(
            "hotel",
            "all hoterl and hostels are",
            Color.parseColor("#ffb174"),
            R.drawable.facebook,
            R.drawable.google
        )
        val src2 = PaperOnboardingPage(
            "12312",
            "all hoterl 13123123123 hostels are",
            Color.parseColor("#ffb174"),
            R.drawable.google,
            R.drawable.facebook
        )
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