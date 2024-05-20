package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    lateinit var loginbtn:Button
    lateinit var fogottenbtn:Button
    lateinit var registerbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginbtn = findViewById(R.id.loginbtn)
        loginbtn.setOnClickListener(){
            openMenu_page()
        }
        fogottenbtn = findViewById(R.id.fogotten)
        fogottenbtn.setOnClickListener(){
            openPassword_change()
        }
        registerbtn = findViewById(R.id.registerL)
        registerbtn.setOnClickListener(){
            openRegister()
        }
    }
    fun openMenu_page(){
        val intent = Intent(this, Menu_page::class.java)
        startActivity(intent)
    }
    fun openPassword_change(){
        val intent = Intent(this, Password_change::class.java)
        startActivity(intent)
    }
    fun openRegister(){
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }
}