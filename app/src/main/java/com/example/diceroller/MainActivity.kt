package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

            rollDice()


            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text
        }


    }

    private fun rollDice() {
        val dice = Dice()
        val resultNumber = dice.roll()
        val resultNumber2=dice.roll()
        val widget1: ImageView = findViewById(R.id.dice1)
        val widget2: ImageView = findViewById(R.id.dice2)

        when(resultNumber){
            1-> widget1.setImageResource(R.drawable.dice_1)
            2-> widget1.setImageResource(R.drawable.dice_2)
            3-> widget1.setImageResource(R.drawable.dice_3)
            4-> widget1.setImageResource(R.drawable.dice_4)
            5-> widget1.setImageResource(R.drawable.dice_5)
            6-> widget1.setImageResource(R.drawable.dice_6)
        }

        when(resultNumber2){
            1-> widget2.setImageResource(R.drawable.dice_1)
            2-> widget2.setImageResource(R.drawable.dice_2)
            3-> widget2.setImageResource(R.drawable.dice_3)
            4-> widget2.setImageResource(R.drawable.dice_4)
            5-> widget2.setImageResource(R.drawable.dice_5)
            6-> widget2.setImageResource(R.drawable.dice_6)
        }

    }
}

class Dice() {
    fun roll(): Int {
        return (1..6).random()
    }
}