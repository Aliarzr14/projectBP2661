package com.example.projectbp2661

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        val btnFairy: Button = findViewById(R.id.buttonFairy)
        val btnFable: Button = findViewById(R.id.buttonFable)
        val btnScience: Button = findViewById(R.id.buttonScience)


    }
}