package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class ProgressBarExample : AppCompatActivity() {
    private var i =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_example)

        val progBar1 = findViewById<ProgressBar>(R.id.prog1)
        val progBar2 = findViewById<ProgressBar>(R.id.prog2)
        val progText = findViewById<TextView>(R.id.progText)
        val startProg = findViewById<Button>(R.id.startProg)
        val resetProg = findViewById<Button>(R.id.resetProg)

        progBar2.visibility = View.INVISIBLE

        startProg.setOnClickListener{
            progBar2.visibility = View.VISIBLE
            i = progBar1.progress
            Thread{
                while(i<100){
                    i = i+1
                    Handler(Looper.getMainLooper()).post{
                        progBar1.progress = i
                        progText.text = i.toString() + "/" + progBar1.max
                        if(i == 100){
                            progBar2.visibility = View.INVISIBLE
                        }
                    }
                    try {
                        Thread.sleep(100)
                    } catch (e:InterruptedException){
                        e.printStackTrace()
                    }
                }
            }.start()
        }

        resetProg.setOnClickListener{
            progBar1.progress = 0
            progText.text = 0.toString() + "/" + progBar1.max
        }

    }
}