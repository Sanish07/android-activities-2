package com.example.cse225

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.util.Log
import android.widget.Toast

class AlarmManBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, p1: Intent?) {
        var audio = MediaPlayer.create(context,R.raw.alarm)
        Log.d("Hello","Repeating alarm")
        audio.start()
        Toast.makeText(context,"Alarm Ringing",Toast.LENGTH_LONG).show()
    }

}