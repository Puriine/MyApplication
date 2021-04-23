package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val animal : Animal = intent.getSerializableExtra("Animal") as Animal
        val background = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val image = findViewById<ImageView>(R.id.images)
        val name = findViewById<TextView>(R.id.name)
        val description = findViewById<TextView>(R.id.description)
        val backbutton = findViewById<ImageButton>(R.id.backButton)

        background.setBackgroundResource(animal.bg)
        image.setImageResource(animal.image)
        name.text = animal.name
        description.text = animal.description

        backbutton.setOnClickListener {
            onBackPressed()
        }
    }
}