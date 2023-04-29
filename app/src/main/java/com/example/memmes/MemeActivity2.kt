package com.example.memmes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity2 : AppCompatActivity() {
    lateinit var tvNextt:TextView
    lateinit var tvPrevious:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        tvNextt = findViewById(R.id.tvNextt)
        tvPrevious = findViewById(R.id.tvPrevious)
        tvNextt.setOnClickListener {
            val intent = Intent(this,MemeActivity3::class.java)
            startActivity(intent)
        }
        tvPrevious.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}












