package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val btnIntent = findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener {
//           open new activity in app

            intent = Intent(applicationContext , SecondActivity::class.java)
            startActivity(intent)
        }
    }
}