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
            findNavController().navigate(R.id.action_onboardingFragment_to_wellcomeFragment)
        }
        fragmentTransaction.add(R.id.fragment_container, paperOnboardingFragment)
        fragmentTransaction.commit()
        return rootView
    }

    private fun getDataForOnBoarding(): ArrayList<PaperOnboardingPage> {
        val src1 = PaperOnboardingPage(
            "Banking",
            "Safety and Security",
            Color.parseColor("#C0C0C0"),
            R.drawable.banks,
            R.drawable.key
        )
        val src2 = PaperOnboardingPage(
            "Shop",
            "Quick Convenience",
            Color.parseColor("#FFDAB9"),
            R.drawable.stores,
            R.drawable.shopping_cart
        )

        val elements = ArrayList<PaperOnboardingPage>()
        elements.add(src1)
        elements.add(src2)

        return elements
    }
}