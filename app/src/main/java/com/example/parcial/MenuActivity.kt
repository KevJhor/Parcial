package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }

        val btnCam: Button = findViewById(R.id.btnCambio)
        btnCam.setOnClickListener {
            val intent1 = Intent(this,CambioActivity::class.java)
            startActivity(intent1)
        }
        val btnCont: Button = findViewById(R.id.btnContactos)
        btnCont.setOnClickListener {
            val intent1 = Intent(this,ContactosActivity::class.java)
            startActivity(intent1)
        }

        val btnEdad: Button = findViewById(R.id.btnEdad)
        btnEdad.setOnClickListener {
            val intent1 = Intent(this,EdadActivity::class.java)
            startActivity(intent1)
        }

    }
}