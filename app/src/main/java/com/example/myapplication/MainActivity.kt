package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

          binding.button.setOnClickListener{
            val message = binding.nameEditTextId.text.toString()
            val intent = Intent(this , Second::class.java)
            intent.putExtra("value",message)
            startActivity(intent)
        }

    }
}

