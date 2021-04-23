package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AnimalActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val backbutton = findViewById<ImageButton>(R.id.backButton)

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter(getList()){ animal ->
            showDetails(animal)
        }
        recyclerView.adapter = adapter

        backbutton.setOnClickListener {
            onBackPressed()
        }


    }

    private fun getList() : MutableList<Animal>{


        val list = mutableListOf<Animal>()
        list.add(Animal("Dog",getString(R.string.dogDescription),R.drawable.doggy,R.drawable.bluerectangle))
        list.add(Animal("Cat", getString(R.string.catDescription),R.drawable.cat,R.drawable.redrectangle))
        list.add(Animal("Lion", getString(R.string.lionDescription),R.drawable.lion,R.drawable.orangerectangle))
        list.add(Animal("Panda",getString(R.string.pandaDescription),R.drawable.panda,R.drawable.greenrectangle,))
        list.add(Animal("Bird",getString(R.string.birdDescription),R.drawable.bird,R.drawable.yellowrectangle))
        return list
    }

    private fun showDetails(animal: Animal){
        val intent = Intent(this, DisplayActivity::class.java)
        intent.putExtra("Animal",  animal)
        startActivity(intent)
    }
}