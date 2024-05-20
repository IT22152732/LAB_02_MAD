package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcome : AppCompatActivity() {
    lateinit var loginbtn:Button
    lateinit var registerbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        loginbtn = findViewById(R.id.login_btn)
        loginbtn.setOnClickListener() {
            openLogin()
        }
        registerbtn = findViewById(R.id.register_btn)
        registerbtn.setOnClickListener() {
            openRegister()
        }
    }
        fun openLogin(){
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }
        fun openRegister(){
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
