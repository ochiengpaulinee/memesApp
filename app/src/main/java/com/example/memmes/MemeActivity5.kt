package com.example.memmes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity5 : AppCompatActivity() {
    lateinit var tvPrvs:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tvPrvs = findViewById(R.id.tvPrvs)
        tvPrvs.setOnClickListener {
            val intent = Intent(this,MemeActivity4::class.java)
            startActivity(intent)
        }

    }
}



