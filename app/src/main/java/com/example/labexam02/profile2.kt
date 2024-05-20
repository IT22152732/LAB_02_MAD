package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile2 : AppCompatActivity() {
    lateinit var yes:Button
    lateinit var no:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        yes = findViewById(R.id.yes)
        yes.setOnClickListener(){
            openwelcome()
        }
        no = findViewById(R.id.no)
        no.setOnClickListener(){
            openprofile1()
        }
    }
    fun openwelcome(){
        val intent = Intent(this, welcome::class.java)
        startActivity(intent)
    }
    fun openprofile1(){
        val intent = Intent(this, profile1::class.java)
        startActivity(intent)
    }
}