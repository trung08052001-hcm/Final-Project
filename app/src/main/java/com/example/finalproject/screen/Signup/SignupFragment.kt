package com.example.finalproject.screen.Signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.finalproject.R
import com.example.finalproject.databinding.FragmentSignupBinding
import com.example.finalproject.viewmodel.SignUpViewModel


class signupFragment : Fragment() {
    private lateinit var binding: FragmentSignupBinding
    private lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using DataBinding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signup, container, false)

        // Get the ViewModel
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)
        viewModel.initSharedPreferences(requireContext())

        // Set the click listener for the sign up button
        binding.buttonSignUp.setOnClickListener {
            val fullname = binding.inputnameSignup.text.toString().trim()
            val email = binding.edtEmailSignUp.text.toString().trim()
            val password = binding.edtPasswordSignUp.text.toString().trim()
            val phone = binding.edtPhoneSignUp.text.toString().trim()
            viewModel.SignUp(requireContext(), fullname, email, password)
        }

        // Observe the isSuccessEvent LiveData
        viewModel.isSuccessEvent.observe(viewLifecycleOwner, {
            if (it) {
//                Toast.makeText(requireContext(), "Registration successful", Toast.LENGTH_SHORT).show()
//                val action = SignUpFragmentDirections.actionSignUpFragmentToLoginFragment()
//                findNavController().navigate(action)
            }
        })

        // Observe the isErrorEvent LiveData
        viewModel.isErrorEvent.observe(viewLifecycleOwner, {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        })

        return binding.root
    }
}