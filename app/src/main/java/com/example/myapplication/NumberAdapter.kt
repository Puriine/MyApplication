package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class NumberAdapter (private val list: MutableList<Number>): RecyclerView.Adapter<NumberAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberAdapter.ViewHolder {
        var layout = 0

        if (viewType == 0){
            layout = R.layout.number_header_layout
        }
        else{
            layout = R.layout.number_display_layout
        }

        val v = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].numberItem
    }

    override fun onBindViewHolder(holder: NumberAdapter.ViewHolder, position: Int) {
        holder.numberContent?.setImageResource(list[position].numberContent)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var numberContent : ImageView?

        init{
            numberContent = itemView.findViewById(R.id.numberContent)
        }
    }


}