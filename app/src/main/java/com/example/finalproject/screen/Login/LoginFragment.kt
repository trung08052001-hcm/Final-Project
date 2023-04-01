package com.example.finalproject.screen.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.finalproject.R
import com.example.finalproject.databinding.FragmentLoginBinding
import com.example.finalproject.viewmodel.LoginViewModel


/**
 * A simple [Fragment] subclass.
 * Use the [loginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        viewModel.initSharedPreferences(requireContext())
        binding.txtLogin.setOnClickListener{
//            val intent = Intent(requireContext(), SignUpActivity::class.java)
//            startActivity(intent)
        }
        binding.buttonLogin.setOnClickListener {
            val email = binding.textinputEmailLogin.text.toString()
            val password = binding.textinputPasswordLogin.text.toString()
            viewModel.checkEmailAndPassword(requireContext(), email, password)
        }

        viewModel.isSuccessEvent.observe(viewLifecycleOwner, { success ->
            if (success) {
//                val intent = Intent(requireContext(), OtpActivity::class.java)
//                startActivity(intent)
//                requireActivity().finish()
            }
        })

        viewModel.isErrorEvent.observe(viewLifecycleOwner, { error ->
//            Toast.makeText(requireContext(), error, Toast.LENGTH_SHORT).show()
        })

        return binding.root
    }
}