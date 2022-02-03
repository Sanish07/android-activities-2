package com.example.cse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_example)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SplashScreenRedir::class.java)
            startActivity(intent)
            finish()}, 5000)
    }
}