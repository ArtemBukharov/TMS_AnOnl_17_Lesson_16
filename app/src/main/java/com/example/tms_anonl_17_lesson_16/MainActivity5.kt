package com.example.tms_anonl_17_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val  textView = findViewById<TextView>(R.id.text_itog)
        val  button = findViewById<Button>(R.id.button_end)
        button.setOnClickListener { startSecondActivity() }

    }

    fun startSecondActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
    }
