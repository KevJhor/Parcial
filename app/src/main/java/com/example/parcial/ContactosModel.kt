package com.example.parcial

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class ContactosModel(val id: Int,
                          val image: Int,
                          val name: String,
                          val cel: String,
                          val fecha: String){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imgC)
        val name: TextView = itemView.findViewById(R.id.txtName)
        val cell: TextView = itemView.findViewById(R.id.txtCell)
        val fecha: TextView = itemView.findViewById(R.id.txtFec)


    }

}
