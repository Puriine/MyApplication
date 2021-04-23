package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LetterActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<LetterAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)

        val recyclerViewLetter = findViewById<RecyclerView>(R.id.recyclerViewLetter)
        val backbutton = findViewById<ImageButton>(R.id.backButton)

        layoutManager = LinearLayoutManager(this)
        recyclerViewLetter.layoutManager = layoutManager

        adapter = LetterAdapter(getList())
        recyclerViewLetter.adapter = adapter

        backbutton.setOnClickListener {
            onBackPressed()
        }

    }
    private fun getList() : MutableList<Letter>{
        val list = mutableListOf<Letter>()
        list.add(Letter(0,"asdf","",R.drawable.rainbow,R.drawable.redtangle))

        list.add(Letter(1,"Aa","apple",R.drawable.apple,R.drawable.redtangular))
        list.add(Letter(1,"Bb","Bee",R.drawable.bee,R.drawable.beebackground))
        list.add(Letter(1,"Cc","crown",R.drawable.crown,R.drawable.crownbackground))
        list.add(Letter(1,"Dd","Dinosaur",R.drawable.dinosaur,R.drawable.dinosaurbackground))
        list.add(Letter(1,"Ee","Elephant",R.drawable.elephant,R.drawable.elephantbackground))
        list.add(Letter(1,"Ff","Fish",R.drawable.fish,R.drawable.fishbackground))
        list.add(Letter(1,"Gg","Goat",R.drawable.goat,R.drawable.goatbackground))
        list.add(Letter(1,"Hh","House",R.drawable.house,R.drawable.housebackground))
        list.add(Letter(1,"Ii","Igloo",R.drawable.igloo,R.drawable.igloobackground))
        list.add(Letter(1,"Jj","Jet",R.drawable.jet,R.drawable.jetbackground))
        list.add(Letter(1,"Kk","Kite",R.drawable.kite,R.drawable.kitebackground))
        list.add(Letter(1,"Ll","Lamp",R.drawable.lamp,R.drawable.lampbackground))
        list.add(Letter(1,"Mm","Monkey",R.drawable.monkey,R.drawable.monkeybackground))
        list.add(Letter(1,"Nn","Nest",R.drawable.nest,R.drawable.nestbackground))
        list.add(Letter(1,"Oo","Owl",R.drawable.owl,R.drawable.owlbackground))
        list.add(Letter(1,"Pp","Pencil",R.drawable.pencil,R.drawable.pencilbackground))
        list.add(Letter(1,"Qq","Queen",R.drawable.queen,R.drawable.queenbackground))
        list.add(Letter(1,"Rr","Robot",R.drawable.robot,R.drawable.robotbackground))
        list.add(Letter(1,"Ss","Star",R.drawable.star,R.drawable.starbackground))
        list.add(Letter(1,"Tt","Turtle",R.drawable.turtle,R.drawable.turtlebackground))
        list.add(Letter(1,"Uu","Umbrella",R.drawable.umbrella,R.drawable.umbrellabackground))
        list.add(Letter(1,"Vv","Volcano",R.drawable.volcano,R.drawable.volcanobackground))
        list.add(Letter(1,"Ww","Wolf",R.drawable.wolf,R.drawable.wolfbackground))
        list.add(Letter(1,"Xx","Xylophone",R.drawable.xylophone,R.drawable.xylophonebackground))
        list.add(Letter(1,"Yy","Yoyo",R.drawable.yoyo,R.drawable.yoyobackground))
        list.add(Letter(1,"Zz","Zipper",R.drawable.zipper,R.drawable.zipperbackground))




        return list
    }
}