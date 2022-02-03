package com.example.cse225

import android.media.Image
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.SeekBar
import java.lang.Exception

class SeekBarExample : AppCompatActivity() {
    lateinit var audio : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar_example)

        var sb = findViewById<SeekBar>(R.id.seekBar1)
        var play = findViewById<ImageView>(R.id.controlBtn)
        var rewind = findViewById<ImageView>(R.id.backBtn)
        var forward = findViewById<ImageView>(R.id.forwardBtn)
        var playing : Boolean = false
        audio = MediaPlayer.create(this,R.raw.song)

        sb.max = audio.duration
        sb.progress = 0

        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                audio.seekTo(sb.progress)
            }
        })

        play.setOnClickListener{
            play.setImageResource(R.drawable.ic_baseline_pause_circle_filled_24)
            if(!playing){
                playing = true
                audio.start()
                Thread(Runnable {
                    var currentPosition = audio.currentPosition
                    val total = audio.duration
                    while(audio.isPlaying && currentPosition < total){
                        currentPosition = try{
                            Thread.sleep(1000)
                            audio.currentPosition
                        } catch (e:InterruptedException){
                            return@Runnable
                        } catch (e:Exception){
                            return@Runnable
                        }
                        sb.setProgress(currentPosition)
                    }
                }).start()
            }
            else{
                audio.pause()
                playing = false
                play.setImageResource(R.drawable.ic_baseline_play_circle_filled_24)
            }
        }

        forward.setOnClickListener{
            if(audio.isPlaying){
                audio.seekTo(audio.currentPosition + 10000)
            }
        }

        rewind.setOnClickListener{
            if(audio.isPlaying){
                audio.seekTo(audio.currentPosition - 10000)
            }
        }
    }


}