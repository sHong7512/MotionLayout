package com.shong.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        var isOk = false
        motionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                isOk = true
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
            }

        })

        CoroutineScope(Dispatchers.Main).launch {
            while (true) {
                if (!isOk) delay(500L)
                else break
            }
//            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
//            finish()
            motionLayout.transitionToState(R.id.startLogin)
            motionLayout.transitionToStart()
        }

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }

    }
}