package com.example.finalproject.screen.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.finalproject.R
import com.example.finalproject.SignUpActivity
import com.example.finalproject.databinding.ActivityLoginBinding
import com.example.finalproject.screen.Otp.OtpActivity
import com.example.finalproject.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        viewModel.initSharedPreferences(this)
        binding.txtLogin.setOnClickListener{
            val intent = Intent(this,SignUpActivity ::class.java)
            startActivity(intent)
        }
        binding.buttonLogin.setOnClickListener {
            val email = binding.textinputEmailLogin.text.toString()
            val password = binding.textinputPasswordLogin.text.toString()
            viewModel.checkEmailAndPassword(this, email, password)
        }

        viewModel.isSuccessEvent.observe(this, { success ->
            if (success) {
                val intent = Intent(this, OtpActivity::class.java)
                startActivity(intent)
                finish()
            }
        })

        viewModel.isErrorEvent.observe(this, { error ->
            Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
        })

    }
}