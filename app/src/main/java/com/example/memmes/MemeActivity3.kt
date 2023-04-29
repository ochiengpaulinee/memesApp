package com.example.memmes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity3 : AppCompatActivity() {
    lateinit var tvNexxt:TextView
    lateinit var tvPreviouss:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        tvNexxt = findViewById(R.id.tvNexxt)
        tvPreviouss = findViewById(R.id.tvPreviouss)
        tvNexxt.setOnClickListener {
            val intent = Intent(this,MemeActivity4::class.java)
            startActivity(intent)
        }
        tvPreviouss.setOnClickListener {
            val intent = Intent(this,MemeActivity2::class.java)
            startActivity(intent)
        }
    }
}







