package com.loftydevelopment.helloworldkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_hello.setOnClickListener {
            val intent = Intent(applicationContext, HelloWorldActivity::class.java)
            startActivity(intent)
        }
    }
}
