package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class ToolbarExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_example)

        var toolbar1 = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar1)
        toolbar1.setTitle("Toolbar Example")
        toolbar1.setLogo(R.drawable.ic_baseline_storage_24)
        setSupportActionBar(toolbar1)
        toolbar1.setNavigationOnClickListener{
            Toast.makeText(this,"Back Arrow",Toast.LENGTH_LONG).show()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar1,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id:Int = item.itemId
        if(id == R.id.ac_settings){
            Toast.makeText(this,"Settings selected",Toast.LENGTH_SHORT).show()
            return true
        } else if(id == R.id.ac_email){
            Toast.makeText(this,"Email selected",Toast.LENGTH_SHORT).show()
            return true
        } else if(id == R.id.ac_add){
            Toast.makeText(this,"Add person selected",Toast.LENGTH_SHORT).show()
            return true
        }
            return super.onOptionsItemSelected(item)
    }
}