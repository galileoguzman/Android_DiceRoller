package com.galileoguzman.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // On click listener for roll_button
        roll_button.setOnClickListener{
            // This segment happen every time the button is clicked
            rollDice()
        }
    }

    // Private function
    private fun rollDice() {
        // Default image before random calc is done
        dice_image.setImageResource(R.drawable.empty_dice)

        // Get random calc
        val randomNumber = Random.nextInt(6) + 1

        // Switch case in kotlin
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Setting up random dice
        dice_image.setImageResource(drawableResource)
    }
}
