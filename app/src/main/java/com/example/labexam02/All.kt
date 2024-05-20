package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class All : AppCompatActivity() {
    lateinit var backa:Button
    lateinit var button2a:Button
    lateinit var button3a:Button
    lateinit var button4a:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all)

        backa = findViewById(R.id.backa)
        backa.setOnClickListener(){
            openMenu_page()
        }
        button2a = findViewById(R.id.button2a)
        button2a.setOnClickListener(){
            openCart()
        }
        button3a = findViewById(R.id.button3a)
        button3a.setOnClickListener(){
            openCart()
        }
        button4a = findViewById(R.id.button4a)
        button4a.setOnClickListener(){
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