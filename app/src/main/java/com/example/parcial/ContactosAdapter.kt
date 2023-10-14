package com.example.parcial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactosAdapter(private val lstGen: List<ContactosModel>) : RecyclerView.Adapter<ContactosModel.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactosModel.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ContactosModel.ViewHolder(layoutInflater.inflate(R.layout.recycler_view_item, parent, false))
    }

    override fun getItemCount(): Int {
        return lstGen.size
    }

    override fun onBindViewHolder(holder: ContactosModel.ViewHolder, position: Int) {
        val itemGen = lstGen[position]
        holder.image.setImageResource(itemGen.image)
        holder.name.text = itemGen.name
        holder.fecha.text = itemGen.fecha
        holder.cell.text = itemGen.cel
    }


}