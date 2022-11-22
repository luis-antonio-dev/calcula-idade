package com.ifac.aula

import android.content.Intent
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
            navigateToResult(getAgeInYears())
        }
    }

    fun navigateToResult(ageInYears: Int) {
        startActivity(Intent(this, Result::class.java).apply {
            // you can add values(if any) to pass to the next class or avoid using `.apply`
            putExtra("ageInYears", ageInYears.toString())
        })
    }

    private fun getAgeInYears(): Int {
        val ageInYears: Int = findViewById<EditText>(R.id.input).text.toString().toInt()
        return ageInYears
    }
}