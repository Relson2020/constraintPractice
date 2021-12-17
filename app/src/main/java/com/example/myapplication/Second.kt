package com.example.myapplication

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.example.myapplication.databinding.SecondBinding


class Second:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding2 = SecondBinding.inflate(layoutInflater)
        setContentView(binding2.root)
        val message = intent.getStringExtra("value")
        binding2.nameTextView2.apply {
            text = message
        }
    }
}