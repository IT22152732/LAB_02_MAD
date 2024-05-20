package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class profile1 : AppCompatActivity() {
    lateinit var lo1:Button
    lateinit var update:Button
    lateinit var delete:Button
    lateinit var imageButton: ImageButton
    lateinit var imageButton3: ImageButton
    lateinit var imageButton4: ImageButton
    lateinit var imageButton5: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile1)

        lo1 = findViewById(R.id.lo1)
        lo1.setOnClickListener(){
            openwelcome()
        }
        update = findViewById(R.id.update)
        update.setOnClickListener(){
            openprofile1()
        }
        delete = findViewById(R.id.delete)
        delete.setOnClickListener(){
            openprofile2()
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
    fun openwelcome(){
        val intent = Intent(this, welcome::class.java)
        startActivity(intent)
    }
    fun openprofile1(){
        val intent = Intent(this, profile1::class.java)
        startActivity(intent)
    }
    fun openprofile2(){
        val intent = Intent(this, profile2::class.java)
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