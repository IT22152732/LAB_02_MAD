package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu_page : AppCompatActivity() {
    lateinit var image_btn2:ImageButton
    lateinit var all:Button
    lateinit var dog:Button
    lateinit var cat:Button
    lateinit var home:ImageButton
    lateinit var search:ImageButton
    lateinit var cart:ImageButton
    lateinit var profile:ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_page)

        image_btn2 = findViewById(R.id.imageButton6)
        image_btn2.setOnClickListener(){
            openprofile1()
        }
        all = findViewById(R.id.all)
        all.setOnClickListener(){
            openAll()
        }
        dog = findViewById(R.id.dog)
        dog.setOnClickListener(){
            openDog()
        }
        cat = findViewById(R.id.cat)
        cat.setOnClickListener(){
            openCat()
        }
        home = findViewById(R.id.imageButton)
        home.setOnClickListener(){
            openMenu_page()
        }

        search = findViewById(R.id.imageButton3)
        search.setOnClickListener(){
            openMenu_page()
        }
        cart = findViewById(R.id.imageButton4)
        cart.setOnClickListener(){
            openCart()
        }
        profile = findViewById(R.id.imageButton5)
        profile.setOnClickListener(){
            openprofile1()
        }


    }
    fun openprofile1(){
        val intent = Intent(this, profile1::class.java)
        startActivity(intent)
    }
    fun openAll(){
        val intent = Intent(this, All::class.java)
        startActivity(intent)
    }
    fun openDog(){
        val intent = Intent(this, Dog::class.java)
        startActivity(intent)
    }
    fun openCat(){
        val intent = Intent(this, Cat::class.java)
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
}