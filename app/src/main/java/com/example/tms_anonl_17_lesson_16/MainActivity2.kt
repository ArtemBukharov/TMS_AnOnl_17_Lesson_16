package com.example.tms_anonl_17_lesson_16

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val  textView = findViewById<TextView>(R.id.text_facts)
        val  button = findViewById<Button>(R.id.button_go_to_act3)
        button.setOnClickListener { startSecondActivity() }

    }

    fun startSecondActivity() {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)

    }

    }
