package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.finalproject.databinding.ActivitySignUpBinding
import com.example.finalproject.screen.Login.LoginActivity
import com.example.finalproject.viewmodel.SignUpViewModel

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var viewModel: SignUpViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.buttonSignUp.setOnClickListener {
            val fullname = binding.inputnameSignup.text.toString().trim()
            val email = binding.edtEmailSignUp.text.toString().trim()
            val password = binding.edtPasswordSignUp.text.toString().trim()
            val phone = binding.edtPhoneSignUp.text.toString().trim()
            viewModel.SignUp(this, fullname,email, password)
        }


        viewModel.isSuccessEvent.observe(this, {
            if (it) {

                Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()


                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        })

        viewModel.isErrorEvent.observe(this, {

            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
    }
}