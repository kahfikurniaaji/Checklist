package com.kahfikurniaaji.checklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kahfikurniaaji.checklist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    fun sendData() {
        binding.btnRegister.setOnClickListener {
            
        }
    }
}