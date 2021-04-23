package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ColorActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ColorAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        val recyclerViewColor = findViewById<RecyclerView>(R.id.recyclerViewColor)
        val backbutton = findViewById<ImageButton>(R.id.backButton)

        layoutManager = LinearLayoutManager(this)
        recyclerViewColor.layoutManager = layoutManager

        adapter = ColorAdapter(getList())
        recyclerViewColor.adapter = adapter

        backbutton.setOnClickListener {
           onBackPressed()
        }
    }

    private fun getList() : MutableList<Color>{
        val list = mutableListOf<Color>()

        list.add(Color(0,"Colors",R.drawable.rainbow,R.drawable.redtangle))

        list.add(Color(1, getString(R.string.giftDescription),R.drawable.giftbox,R.drawable.redtangle))
        list.add(Color(1, getString(R.string.carrotDescription),R.drawable.carrot,R.drawable.orangetangle))
        list.add(Color(1, getString(R.string.duckDescription),R.drawable.duck,R.drawable.yellowtangle))
        list.add(Color(1,getString(R.string.treeDescription),R.drawable.tree,R.drawable.greentangle))
        list.add(Color(1,getString(R.string.waveDescription),R.drawable.wave,R.drawable.bluetangle))
        list.add(Color(1,getString(R.string.chairDescription),R.drawable.chair,R.drawable.indigotangle))
        list.add(Color(1,getString(R.string.grapesDescription),R.drawable.grapes,R.drawable.violetangle))



        return list
    }
}