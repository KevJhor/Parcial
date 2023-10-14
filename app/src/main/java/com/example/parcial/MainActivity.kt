package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user: EditText = findViewById(R.id.txtUser)
        val pass: EditText = findViewById(R.id.txtPass)


        val btnLog: Button = findViewById(R.id.btnLog)

        btnLog.setOnClickListener {
            if(user.text.toString() == "admin@multiapp.com" && pass.text.toString() == "multiapp123"){
                val intent = Intent(this,MenuActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Credenciales inválidas", Toast.LENGTH_SHORT).show()
            }

        }

    }
}