package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class order_confirm : AppCompatActivity() {
    lateinit var Confirm:Button
    lateinit var imageButton: ImageButton
    lateinit var imageButton3: ImageButton
    lateinit var imageButton4: ImageButton
    lateinit var imageButton5: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirm)

        Confirm = findViewById(R.id.Confirm)
        Confirm.setOnClickListener(){
            openpayment_confirm()
        }
        imageButton = findViewById(R.id.imageButton)
        imageButton.setOnClickListener(){
            openMenu_page()
        }
        imageButton3 = findViewById(R.id.imageButton3)
        imageButton3.setOnClickListener(){
            openMenu_page()
        }
        imageButton4 = findViewById(R.id.imageButton4)
        imageButton4.setOnClickListener(){
            openCart()
        }
        imageButton5 = findViewById(R.id.imageButton5)
        imageButton5.setOnClickListener(){
            openprofile1()
        }
    }
    fun openpayment_confirm(){
        val intent = Intent(this, payment_confirm::class.java)
        startActivity(intent)
    }
    fun openMenu_page(){
        val intent = Intent(this, Menu_page::class.java)
        startActivity(intent)
    }
    fun openCart(){
        val intent = Intent(this, Cart::class.java)
        startActivity(intent)
    }
    fun openprofile1(){
        val intent = Intent(this, profile1::class.java)
        startActivity(intent)
    }

}