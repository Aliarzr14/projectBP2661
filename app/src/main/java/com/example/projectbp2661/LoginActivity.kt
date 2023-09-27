package com.example.projectbp2661

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //intent explicit
        //instonce
        val btnlogin:Button = findViewById(R.id.button3)
        //event btn login click
        btnlogin.setOnClickListener{
            //coll Home
        }

    }
}