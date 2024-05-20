package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var nextbtn2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nextbtn2 = findViewById(R.id.next2)
        nextbtn2.setOnClickListener(){
            openGet_started()
        }
    }
    fun openGet_started(){
        val intent = Intent(this, Get_started::class.java)
        startActivity(intent)
    }
}