package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity:AppCompatActivity(),View.OnClickListener{

    lateinit var rollbutton: Button
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        rollbutton.setOnClickListener(this)
    }
    //To initialize views
    private fun initViews(){
        rollbutton = findViewById(R.id.button)
        diceImage = findViewById(R.id.dice_image)
    }
    //handling on click for button
    override fun onClick(view: View?) {
        view?.let{
            when(view.id){
                R.id.button -> rollDice()
                else -> return
            }
        }

    }
    //invoked on button click
    private fun rollDice(): Unit {
            val randomNum = Random().nextInt(6)+1
            val diceImageDrawable = when(randomNum){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.dice_1
            }
        diceImage.setImageResource(diceImageDrawable)
    }
}