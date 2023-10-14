package com.example.parcial

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import kotlin.time.Duration.Companion.days

class EdadActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edad)

        val btnBack: Button = findViewById(R.id.btnBackMenu2)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,MenuActivity::class.java)
            startActivity(intent1)
        }

        val fechaN: EditText = findViewById(R.id.txtFN)
        val edad: TextView = findViewById(R.id.txtEdadDias)
        val formaterFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy")


        val btnCalEdad: Button = findViewById(R.id.btnCalcularE)
        btnCalEdad.setOnClickListener {
            val fechaActual = LocalDate.now()
            val fechaNacimiento = LocalDate.parse(fechaN.text.toString(),formaterFecha)
            edad.text = (Period.between(fechaNacimiento,fechaActual).years * 365).toString()
            



        }


    }
}