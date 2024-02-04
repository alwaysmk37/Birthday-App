package com.example.wrought

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        val username = findViewById<TextView>(R.id.txt2)

        var textname = intent.getStringExtra("nametxt")

        username.text = "Happy Birthday $textname"
    }
}