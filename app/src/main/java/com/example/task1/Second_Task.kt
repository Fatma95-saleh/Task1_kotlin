package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_second__task.*
import kotlinx.android.synthetic.main.activity_second__task.view.*

class Second_Task : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second__task)



/*
        var input1= input1.text
        var input2 =input2.text
        add.setOnClickListener{
        result_add.text = input1 +input2

        }
 */
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

        go_to_third_activity.setOnClickListener {
            startActivity(Intent(this,linear_layout::class.java))
        }


    }
}