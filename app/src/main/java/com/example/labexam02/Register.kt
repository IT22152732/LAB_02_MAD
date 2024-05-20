package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    lateinit var registerbtn:Button
    lateinit var loginbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerbtn = findViewById(R.id.registerbtn)
        registerbtn.setOnClickListener(){
            openLogin()
        }

        loginbtn = findViewById(R.id.loginR)
        loginbtn.setOnClickListener(){
            openLogin()
        }
    }
    fun openLogin(){
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

}

