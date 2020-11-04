package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

lateinit var text1:TextView
lateinit var button:Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var inputname=input_text.text
        button_id.setOnClickListener{  text2_id.text= "Hello $inputname" }
        button2.setOnClickListener{
            startActivity(Intent(this,Second_Task::class.java))

        }

    }
}