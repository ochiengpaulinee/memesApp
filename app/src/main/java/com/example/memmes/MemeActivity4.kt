package com.example.memmes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity4 : AppCompatActivity() {
    lateinit var tvNextts:TextView
    lateinit var tvPrrevious:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tvNextts = findViewById(R.id.tvNextts)
        tvPrrevious = findViewById(R.id.tvPrrevious)
        tvNextts.setOnClickListener {
            val intent = Intent(this,MemeActivity5::class.java)
            startActivity(intent)
        }
        tvPrrevious.setOnClickListener {
            val intent = Intent(this,MemeActivity3::class.java)
            startActivity(intent)
        }
    }
}
