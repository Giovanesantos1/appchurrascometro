package com.example.appchurrascometro

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtNumAdult = findViewById<TextInputEditText>(R.id.edt_number_of_adult)
        val edtNumkids = findViewById<TextInputEditText>(R.id.edt_number_of_kids)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        val carne = 400
        val carneKids = 200
        val cerveja = 4
        val refri = 1

        btnCalcular.setOnClickListener {
            val numAdult: Float = edtNumAdult.text.toString().toFloat()
            val numKids: Float = edtNumkids.text.toString().toFloat()

            val totalCarneAdulto = numAdult * carne
            val totalCarneKIds = numKids * carneKids
            val totalCarne = totalCarneAdulto + totalCarneKIds / 1000
            val totalCereveja = numAdult * cerveja
            val totalRefri = numAdult + numKids * refri

            println(totalCarne)
            println(totalCereveja)
            println(totalRefri)

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}