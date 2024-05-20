package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cat : AppCompatActivity() {
    lateinit var backc:Button
    lateinit var button2c:Button
    lateinit var button3c:Button
    lateinit var button4c:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)

        backc = findViewById(R.id.backa)
        backc.setOnClickListener(){
            openMenu_page()
        }
        button2c = findViewById(R.id.button2a)
        button2c.setOnClickListener(){
            openCart()
        }
        button3c = findViewById(R.id.button3a)
        button3c.setOnClickListener(){
            openCart()
        }
        button4c = findViewById(R.id.button4a)
        button4c.setOnClickListener(){
            openCart()
        }

    }
    fun openMenu_page(){
        val intent = Intent(this, Menu_page::class.java)
        startActivity(intent)
    }
    fun openCart(){
        val intent = Intent(this, Cart::class.java)
        startActivity(intent)
    }

}