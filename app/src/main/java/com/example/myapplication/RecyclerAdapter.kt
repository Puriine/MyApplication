package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val list: MutableList<Animal>, private val onItemClicked: (Animal) -> Unit) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.animal_display_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemText.text = list[position].name
        holder.itemImage.setImageResource(list[position].image)
        holder.itemBg.setImageResource(list[position].bg)
    }


    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemBg : ImageView
        var itemText : TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemBg =   itemView.findViewById(R.id.item_bg)
            itemText  = itemView.findViewById(R.id.item_text)

            itemView.setOnClickListener{
                val position: Int = adapterPosition
                onItemClicked(list[position])
            }
        }
    }

}