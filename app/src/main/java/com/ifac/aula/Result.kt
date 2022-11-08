package com.ifac.aula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        handleCalculateAge()
    }


    private fun handleCalculateAge() {
        val bundle : Bundle? = intent.extras
        val ageInYears = bundle!!.getString("ageInYears").toString()

        val ageInDays: Int = calculateAge(ageInYears.toInt())
        displayAgeOnScreen(ageInDays)
    }

    private fun displayAgeOnScreen(ageInDays: Int) {
        val result = findViewById<TextView>(R.id.result_days)
        result.text = "$ageInDays Dias"
    }

    private fun calculateAge(ageInYears: Int): Int {
        return ageInYears * 365
    }
}