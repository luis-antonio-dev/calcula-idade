package com.ifac.aula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        Log.d("tonhao", "before getAgeFromBundle")
        val foo = getAgeFromBundle("ageInDays")
        Log.d("tonhao", foo.toString())
    }

    private fun getAgeFromBundle(key: String): Int {
        Log.d("tonhao", "entrou na função")
        val bundle : Bundle? = intent.extras
        Log.d("tonhao", "pegou o bundle")
        val age = bundle!!.getString(key).toString()
        Log.d("tonhao", "pegou o age $age")

        return age.toInt()
    }
}