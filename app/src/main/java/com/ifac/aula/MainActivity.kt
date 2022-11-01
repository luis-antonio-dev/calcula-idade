package com.ifac.aula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<AppCompatButton>(R.id.action_button)

        button.setOnClickListener {
            handleCalculateAge()
        }
    }

    private fun handleCalculateAge() {
        val ageInYears: Int = findViewById<EditText>(R.id.input).text.toString().toInt()
        val ageInDays: Int = calculateAge(ageInYears)

        val result = findViewById<TextView>(R.id.result)
        result.text = "$ageInDays Dias"
    }

    private fun calculateAge(ageInYears: Int): Int {
        return ageInYears * 365
    }
}