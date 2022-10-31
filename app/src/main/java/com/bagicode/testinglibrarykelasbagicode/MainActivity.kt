package com.bagicode.testinglibrarykelasbagicode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.bagicode.bagicodebuild.utils.hilang

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.tv_helloworld)
        textview.hilang()

        textview.visibility = View.GONE
    }
}