package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Practice_Edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice_edit)

        val edittext = findViewById<EditText>(R.id.textPrint)
        val submit = findViewById<Button>(R.id.butSub)

        submit.setOnClickListener{
            var text = edittext.text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }

    }
}