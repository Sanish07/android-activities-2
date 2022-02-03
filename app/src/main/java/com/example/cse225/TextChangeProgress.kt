package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.widget.doOnTextChanged

class TextChangeProgress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_change_progress)

        val textBox = findViewById<EditText>(R.id.countText)
        val textDis = findViewById<TextView>(R.id.textTotal)
        val progBar = findViewById<ProgressBar>(R.id.progText)

        textBox.doOnTextChanged { text, start, count, after ->
            textDis.text = textBox.text.length.toString()
            progBar.progress = textDis.text.toString().toInt()
        }
    }
}