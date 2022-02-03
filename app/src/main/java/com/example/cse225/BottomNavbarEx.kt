package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavbarEx : AppCompatActivity() {
    lateinit var tvLabel : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navbar_ex)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        tvLabel = findViewById(R.id.tvLabel)

        bottomNav.setOnItemSelectedListener{
            when (it.itemId){
                R.id.menu_home ->{
                    setContent("Home")
                    true
                }
                R.id.menu_noti ->{
                    setContent("Notification")
                    true
                }
                R.id.menu_search ->{
                    setContent("Search")
                    true
                }
                R.id.menu_prof ->{
                    setContent("Profile")
                    true
                }
                else -> false
            }
        }

    }
    private fun setContent(content:String){
        setTitle(content)
        tvLabel.text = content
    }
}