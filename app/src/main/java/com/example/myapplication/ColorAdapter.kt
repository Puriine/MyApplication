package com.example.myapplication

import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ColorAdapter (private val list: MutableList<Color>) : RecyclerView.Adapter<ColorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorAdapter.ViewHolder {
        var layout = 0

        if (viewType == 0){
            layout = R.layout.color_header_layout
        }
        else{
            layout = R.layout.color_display_layout
        }

         val v = LayoutInflater.from(parent.context).inflate(layout, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].colorItem
    }

    override fun onBindViewHolder(holder: ColorAdapter.ViewHolder, position: Int) {
//            holder.colorText?.text = list[position].colorText
        holder.colorText?.text = Html.fromHtml(list[position].colorText, Html.FROM_HTML_OPTION_USE_CSS_COLORS)
        holder.colorImage?.setImageResource(list[position].colorImage)
        holder.colorBg?.setImageResource(list[position].colorBg)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var colorImage : ImageView?
        var colorText : TextView?
        var colorBg : ImageView?

        init{
            colorImage = itemView.findViewById(R.id.itemColor_image)
            colorText = itemView.findViewById(R.id.itemColor_text)
            colorBg = itemView.findViewById(R.id.itemColor_bg)
        }
    }
}