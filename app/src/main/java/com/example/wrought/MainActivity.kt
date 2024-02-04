package com.example.wrought

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputname = findViewById<EditText>(R.id.namet)

        val generatebtn = findViewById<Button>(R.id.submitbtn)

        generatebtn.setOnClickListener {

            var nametxt = inputname.text.toString()
            val intent = Intent(this, BirthdayActivity::class.java)
            intent.putExtra("nametxt", nametxt)
            startActivity(intent)

        }




    }
}