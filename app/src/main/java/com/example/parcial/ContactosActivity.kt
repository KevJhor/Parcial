package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)


        val btnBack: Button = findViewById(R.id.btnBackMenu3)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,MenuActivity::class.java)
            startActivity(intent1)
        }

        val rvEstab: RecyclerView = findViewById(R.id.rcContact)
        rvEstab.layoutManager = LinearLayoutManager(this)
        rvEstab.adapter = ContactosAdapter(ListContactos())

    }
    private fun ListContactos(): List<ContactosModel>{
        val lstEstab: ArrayList<ContactosModel> = ArrayList()

        lstEstab.add(ContactosModel(1,R.drawable.contacto1,"Gina David","+051 995090810", "10/01/2020"))
        lstEstab.add(ContactosModel(2,R.drawable.contacto1,"Julienmne Mark","+051 975050810", "12/05/2008"))
        lstEstab.add(ContactosModel(1,R.drawable.contacto1,"Jhon Erik","+051 985596870", "05/11/2020"))
        lstEstab.add(ContactosModel(2,R.drawable.contacto1,"Elver Fausto","+051 907099850", "12/01/2021"))

        return lstEstab
    }
}