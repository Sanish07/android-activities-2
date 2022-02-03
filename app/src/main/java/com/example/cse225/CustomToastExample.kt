package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CustomToastExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast_example)
        val btnToast = findViewById<Button>(R.id.btnToast)
        btnToast.setOnClickListener{
            val vg : ViewGroup? = findViewById(R.id.cus_toast)
            val inflater = layoutInflater

            val layout : View = inflater.inflate(R.layout.custom_toast_layout,vg)

            val tv = layout.findViewById<TextView>(R.id.txtView)
            tv.text = "This is a Custom Toast"
            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.CENTER_VERTICAL,0,650)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()
        }
    }
}