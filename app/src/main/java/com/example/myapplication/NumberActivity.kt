package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumberActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<NumberAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        val recyclerViewNumber = findViewById<RecyclerView>(R.id.recyclerViewNumber)
        val backbutton = findViewById<ImageButton>(R.id.backButton)

        layoutManager = LinearLayoutManager(this)
        recyclerViewNumber.layoutManager = layoutManager

        adapter = NumberAdapter(getList())
        recyclerViewNumber.adapter = adapter

        backbutton.setOnClickListener {
            onBackPressed()
        }
    }

    private fun getList() : MutableList<Number>{
        val list = mutableListOf<Number>()

        list.add(Number(0,R.drawable.yellowtangle))
        list.add(Number(1,R.drawable.one))
        list.add(Number(1,R.drawable.two))
        list.add(Number(1,R.drawable.three))
        list.add(Number(1,R.drawable.four))
        list.add(Number(1,R.drawable.five))
        list.add(Number(1,R.drawable.six))
        list.add(Number(1,R.drawable.seven))
        list.add(Number(1,R.drawable.eight))
        list.add(Number(1,R.drawable.nine))
        list.add(Number(1,R.drawable.ten))


        return list
    }
}