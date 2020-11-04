package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second__task.*

class linear_layout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        add.setOnClickListener {

            result_add.text="result"+" "+(num1.text.toString().toInt() +num2.text.toString().toInt()).toString()

        }
        sub.setOnClickListener {

            result_sub.text="result"+" "+(num1.text.toString().toInt() -num2.text.toString().toInt()).toString()

        }
        multiplay.setOnClickListener {

            result_multiplay.text="result" + " "+(num1.text.toString().toInt() * num2.text.toString().toInt()).toString()

        }
        division.setOnClickListener {

            result_division.text="result"+" "+(num1.text.toString().toInt() / num2.text.toString().toInt()).toString()

        }
    }
}