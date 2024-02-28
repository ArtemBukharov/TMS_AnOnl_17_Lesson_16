package com.example.tms_anonl_17_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val  textView = findViewById<TextView>(R.id.text_my)
        val  button = findViewById<Button>(R.id.button_go_to_act5)
        button.setOnClickListener { startSecondActivity() }

    }

    fun startSecondActivity() {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)

    }
    }
