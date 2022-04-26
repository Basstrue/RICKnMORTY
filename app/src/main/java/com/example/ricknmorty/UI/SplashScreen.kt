package com.example.ricknmorty.UI

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.ricknmorty.R

class SplashScreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        /**val SPLASH_TIME_OUT = 2000
        val intent = Intent(this@SplashScreen, MainActivity::class.java)
        Handler().postDelayed({
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT.toLong())*/

        val timer = object: CountDownTimer(3000, 200){
            override fun onTick(p0: Long) {}

            override fun onFinish() {
                val intent = Intent(this@SplashScreen, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}