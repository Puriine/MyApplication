package com.example.myapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        val buttonAnimal = findViewById<ImageButton>(R.id.animalButton)
        val buttonColor = findViewById<ImageButton>(R.id.colorButton)
        val buttonLetter = findViewById<ImageButton>(R.id.letterButton)
        val buttonNumber = findViewById<ImageButton>(R.id.numberButton)
        val buttonExercise = findViewById<ImageButton>(R.id.exerciseButton)
        val buttonCredits = findViewById<ImageButton>(R.id.creditButton)

        buttonAnimal.setOnClickListener {
            val intent = Intent ( this, AnimalActivity::class.java)
            startActivity(intent)
        }
        buttonColor.setOnClickListener {
            val intent = Intent ( this, ColorActivity::class.java)
            startActivity(intent)
        }
        buttonLetter.setOnClickListener {
            val intent = Intent ( this, LetterActivity::class.java)
            startActivity(intent)
        }
        buttonNumber.setOnClickListener {
            val intent = Intent ( this, NumberActivity::class.java)
            startActivity(intent)
        }
        buttonExercise.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }
        buttonCredits.setOnClickListener {
            val intent = Intent ( this, CreditActivity::class.java)
            startActivity(intent)
        }
    }
}