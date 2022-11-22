package com.ifac.aula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val buttonHistory = findViewById<AppCompatButton>(R.id.history_button)

        buttonHistory.setOnClickListener {
            startActivity(Intent(this, History::class.java).apply {
                putExtra("ageInDays", handleCalculateAge().toString())
                putExtra("getAgeInYears", getAgeInYears().toString())
            })
        }

        handleCalculateAge()
    }


    private fun handleCalculateAge(): Int {
        val ageInDays: Int = calculateAge(getAgeInYears())
        displayAgeOnScreen(ageInDays)

        return ageInDays;
    }

    private fun getAgeInYears(): Int {
        val bundle : Bundle? = intent.extras
        val ageInYears = bundle!!.getString("ageInYears").toString()

        return ageInYears.toInt()
    }

    private fun displayAgeOnScreen(ageInDays: Int) {
        val result = findViewById<TextView>(R.id.result_days)
        result.text = "$ageInDays Dias"
    }

    private fun calculateAge(ageInYears: Int): Int {
        return ageInYears * 365
    }
}