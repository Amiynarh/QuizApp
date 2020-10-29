package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.View
import com.quizapp.category.CategoryActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        android.os.Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent (this, CategoryActivity::class.java))
            finish()
        }, 3000)
    }
}