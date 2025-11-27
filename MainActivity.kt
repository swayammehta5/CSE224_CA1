package com.example.ca

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val sub1 = findViewById<EditText>(R.id.esub1)
            val sub2 = findViewById<EditText>(R.id.esub2)
            val sub3 = findViewById<EditText>(R.id.esub3)
            val output = findViewById<TextView>(R.id.ouput)
            val btn = findViewById<Button>(R.id.button)
            btn.setOnClickListener {
                val n1 = sub1.text.toString().toInt()
                val n2 = sub2.text.toString().toInt()
                val n3 = sub3.text.toString().toInt()
                val sum = n1 + n2 + n3
                val percentage = (sum / 300.0) * 100
                val cgpa = percentage / 10
                var grade = ""
                if (cgpa >= 8) {
                    grade = "A"
                } else if (cgpa >= 6 && cgpa < 8) {
                    grade = "B"
                } else if (cgpa >= 4 && cgpa < 6) {
                    grade = "C"
                } else {
                    grade = "E"
                }
                output.text = grade
                Toast.makeText(this, "Grade is $grade", Toast.LENGTH_SHORT).show()
            }
        }
    }
