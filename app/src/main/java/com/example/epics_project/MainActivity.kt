package com.example.epics_project

import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creating objects of fragment classes
        var obj_1 = Fragment_1()
        var obj_2 = Fragment_2()
        var obj_3 = Fragment_3()

    }
}