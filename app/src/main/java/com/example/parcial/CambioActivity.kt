package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CambioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambio)

        val btnBack: Button = findViewById(R.id.btnBackMenu)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,MenuActivity::class.java)
            startActivity(intent1)
        }

        val tipoCambio: EditText = findViewById(R.id.txtCambioV)
        val MontoDolar: EditText = findViewById(R.id.txtMontoD)

        val txtResultC: TextView = findViewById(R.id.txtResultC)
        val txtB100: TextView = findViewById(R.id.txtB100)
        val txtB50: TextView = findViewById(R.id.txtB50)
        val txtB20: TextView = findViewById(R.id.txtB20)

        val btnCalCambio: Button = findViewById(R.id.btnCalEdad)


        btnCalCambio.setOnClickListener {
            val valor = tipoCambio.text.toString().toDouble()*MontoDolar.text.toString().toDouble()
            txtResultC.text = "S/.$valor"
            val billete100 = (valor/100).toInt()
            val billete50 = ((valor - billete100*100)/50).toInt()
            val billete20 = ((valor-billete100*100-billete50*50)/20).toInt()
            txtB100.text = "$billete100 billetes de 100"
            txtB50.text = "$billete50 billetes de 50"
            txtB20.text = "$billete20 billetes de 20"

        }


    }
}