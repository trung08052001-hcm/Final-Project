package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        var btnotp : ImageView = findViewById(R.id.imageViewButtonOtp)
        btnotp.setOnClickListener {
            val intent = Intent(this, NewPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}