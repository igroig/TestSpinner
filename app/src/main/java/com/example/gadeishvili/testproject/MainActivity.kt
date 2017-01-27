package com.example.gadeishvili.testproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var a1: TextView? = null
    private var a2: TextView? = null
    private var a3: TextView? = null
    private var activity_main: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ACTIVITY_MAIN)
        initView()

    }

    private fun initView() {
        // normal
        a1 = findViewById(R.id.a1) as TextView
        a1!!.text = "1"
        activity_main = findViewById(R.id.activity_main) as RelativeLayout

        // large
        if (getString(R.string.large_screen) == getString(R.string.screen_size)) {
            a2 = findViewById(R.id.a2) as TextView
            a2!!.text = "2"
        }

        // xlarge
        if (getString(R.string.x_large_screen) == getString(R.string.screen_size)) {
            a2 = findViewById(R.id.a2) as TextView
            a2!!.text = "2"
            a3 = findViewById(R.id.a3) as TextView
            a3!!.text = "3"
        }
    }

    companion object {


        val ACTIVITY_MAIN = R.layout.activity_main
    }
}
