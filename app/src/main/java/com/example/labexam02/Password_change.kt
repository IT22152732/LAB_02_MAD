package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Password_change : AppCompatActivity() {
    lateinit var verifybtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_change)

        verifybtn = findViewById(R.id.verify)
        verifybtn.setOnClickListener(){
            openLogin()
        }
    }
    fun openLogin(){
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}