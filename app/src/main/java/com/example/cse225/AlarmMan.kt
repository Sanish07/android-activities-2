package com.example.cse225

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi

class AlarmMan : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_man)
        var start = findViewById<Button>(R.id.btnStart)
        var rep_start = findViewById<Button>(R.id.btnRepeat)
        var cancel = findViewById<Button>(R.id.btnCancel)
    }
}