package com.example.gadeishvili.testproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

    }

    fun add( a: Int?, b: Int? ) : Int{
        return 9
    }



}