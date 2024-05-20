package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Get_started : AppCompatActivity() {
    lateinit var getstartedbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        getstartedbtn = findViewById(R.id.getstarted)
        getstartedbtn.setOnClickListener(){
            openwelcome()
        }
    }
    fun openwelcome(){
        val intent = Intent(this, welcome::class.java)
        startActivity(intent)
    }
}