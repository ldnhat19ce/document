package com.ldnhat.flashlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    internal lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler()
        handler.postDelayed({
            var intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}