package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dog : AppCompatActivity() {
    lateinit var back1:Button
    lateinit var addtocart1d:Button
    lateinit var addtocart2d:Button
    lateinit var addtocart3d:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog)

        back1 = findViewById(R.id.backa)
        back1.setOnClickListener(){
            openMenu_page()
        }
        addtocart1d = findViewById(R.id.button2a)
        addtocart1d.setOnClickListener(){
            openCart()
        }
        addtocart1d = findViewById(R.id.button3a)
        addtocart1d.setOnClickListener(){
            openCart()
        }
        addtocart1d = findViewById(R.id.button4a)
        addtocart1d.setOnClickListener(){
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