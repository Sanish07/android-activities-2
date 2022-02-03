package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class RatingBarExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar_example)

        val rateBar1 = findViewById<RatingBar>(R.id.rateBar1)
        val rateBar2 = findViewById<RatingBar>(R.id.rateBar2)
        val butSub = findViewById<Button>(R.id.rateSub)
        val textRate = findViewById<TextView>(R.id.rateFeed)

        butSub.setOnClickListener{
            val bar1max = "Rate Bar 1 stars (max) : ${rateBar1.numStars}"
            val bar1rating = "Rate Bar 1 rating given : ${rateBar1.rating}"
            Toast.makeText(applicationContext,"Rating Submitted..",Toast.LENGTH_SHORT).show()
            textRate.text = bar1max + "\n" + bar1rating
        }
        
        rateBar2.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener{
            ratingBar : RatingBar?, rating : Float, fromUser : Boolean ->
            Toast.makeText(this,"Rating $rating , $fromUser",Toast.LENGTH_LONG).show()
        }
    }
}