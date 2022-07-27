package com.example.practicesdkimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practice.mathematics.Math

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Math.appIntegers(1, 2, 3, 4);
    }
}