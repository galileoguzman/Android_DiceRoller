package com.galileoguzman.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        roll_button.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumber = Random.nextInt(6) + 1
        result_text.text = randomNumber.toString()
    }
}
