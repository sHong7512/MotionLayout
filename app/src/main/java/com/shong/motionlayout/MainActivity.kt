package com.shong.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.deltaButton).setOnClickListener {
            startActivity(Intent(this, DeltaRelativeActivity::class.java))
        }

//        findViewById<ImageButton>(R.id.sideMenu).setOnClickListener {
//
//        }
    }
}