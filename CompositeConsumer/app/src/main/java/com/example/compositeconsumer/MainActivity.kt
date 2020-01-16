package com.example.compositeconsumer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.compositeproducer.Library

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Library().hello()
    }
}
