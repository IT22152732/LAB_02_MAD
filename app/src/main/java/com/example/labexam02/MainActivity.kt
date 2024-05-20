package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var nextbtn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextbtn1 = findViewById(R.id.next1)
        nextbtn1.setOnClickListener(){
                openMainActivity2()
        }
    }
    fun openMainActivity2(){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}