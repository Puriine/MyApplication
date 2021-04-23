package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LetterAdapter (private val list: MutableList<Letter>): RecyclerView.Adapter<LetterAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterAdapter.ViewHolder {
        var layout = 0

        if (viewType == 0){
            layout = R.layout.letter_header_layout
        }
        else{
            layout = R.layout.letter_display_layout
        }

        val v = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return list.size
    }
    override fun getItemViewType(position: Int): Int {
        return list[position].letterItem
    }
    override fun onBindViewHolder(holder: LetterAdapter.ViewHolder, position: Int) {
        holder.letterText?.text  = list[position].letterText
        holder.letterName?.text = list[position].letterName
        holder.letterImage?.setImageResource(list[position].letterImage)
        holder.letterBg?.setImageResource(list[position].letterBg)

    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var letterText : TextView?
        var letterName : TextView?
        var letterImage : ImageView?
        var letterBg : ImageView?

        init{
            letterText = itemView.findViewById(R.id.letter_letter)
            letterName =  itemView.findViewById(R.id.letter_name)
            letterImage = itemView.findViewById(R.id.letter_image)
            letterBg = itemView.findViewById(R.id.letter_bg)
        }
    }

}