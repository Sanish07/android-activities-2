package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class RatingBarAvg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar_avg)

        val rateBar1 = findViewById<RatingBar>(R.id.rateBar1)
        val rateBar2 = findViewById<RatingBar>(R.id.rateBar2)
        val rateBar3 = findViewById<RatingBar>(R.id.rateBar3)
        val butSub = findViewById<Button>(R.id.rateSub)
        val rateFeed = findViewById<TextView>(R.id.rateFeed)
        val rateBarFinal = findViewById<RatingBar>(R.id.rateBarAv)

        butSub.setOnClickListener{
            var feedText = ""
            var numStars = rateBar1.rating + rateBar2.rating + rateBar3.rating
            var av = numStars/3.0
            rateBarFinal.rating = av.toFloat()
            if(av>=0 && av<=2.5){
                feedText = "Bad"
            } else if(av>2.5 && av<=3.5){
                feedText = "Average"
            } else if(av>3.5 && av<=5.0){
              feedText = "Good"
            } else{
                feedText = "Excellent"
            }
            rateFeed.text = "Overall Rating : ${feedText}"
        }

    }
}