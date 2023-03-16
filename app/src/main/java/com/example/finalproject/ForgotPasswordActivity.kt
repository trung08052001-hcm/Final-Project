package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        var btnforgot : ImageView = findViewById(R.id.imageViewForgotpassword)
        btnforgot.setOnClickListener {
            val intent = Intent(this, OtpActivity::class.java)
            startActivity(intent)
        }
    }
}