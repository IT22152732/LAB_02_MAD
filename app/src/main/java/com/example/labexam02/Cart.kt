package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Cart : AppCompatActivity() {
    lateinit var carticon:ImageButton
    lateinit var check:Button
    lateinit var backto:Button
    lateinit var imageButton: ImageButton
    lateinit var imageButton3: ImageButton
    lateinit var imageButton4: ImageButton
    lateinit var imageButton5: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        carticon = findViewById(R.id.carticon)
        carticon.setOnClickListener(){
            openCart()
        }
        check = findViewById(R.id.check)
        check.setOnClickListener(){
            openorder_confim()
        }
        backto = findViewById(R.id.backto)
        backto.setOnClickListener(){
            openMenu_page()
        }
        imageButton  =findViewById(R.id.imageButton)
        imageButton.setOnClickListener(){
            openMenu_page()
        }
        imageButton3  =findViewById(R.id.imageButton3)
        imageButton3.setOnClickListener(){
            openMenu_page()
        }
        imageButton4  =findViewById(R.id.imageButton4)
        imageButton4.setOnClickListener(){
            openCart()
        }
        imageButton5  =findViewById(R.id.imageButton5)
        imageButton5.setOnClickListener(){
            openprofile1()
        }

    }
    fun openCart(){
        val intent = Intent(this, Cart::class.java)
        startActivity(intent)
    }
    fun openorder_confim(){
        val intent = Intent(this, order_confirm::class.java)
        startActivity(intent)
    }
    fun openMenu_page(){
        val intent = Intent(this, Menu_page::class.java)
        startActivity(intent)
    }
    fun openprofile1(){
        val intent = Intent(this, profile1::class.java)
        startActivity(intent)
    }
}