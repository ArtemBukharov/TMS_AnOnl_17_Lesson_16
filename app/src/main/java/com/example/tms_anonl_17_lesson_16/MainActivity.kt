package com.example.tms_anonl_17_lesson_16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tms_anonl_17_lesson_16.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  textView = findViewById<TextView>(R.id.textViewPredljenie)
        val  button = findViewById<Button>(R.id.ButtonGo)
        button.setOnClickListener { startSecondActivity() }

    }

    fun startSecondActivity() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)

    }

}