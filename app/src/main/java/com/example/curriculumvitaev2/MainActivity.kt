package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn= findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            val Intent=Intent(this,SecondryActivity::class.java)
            startActivity(Intent)
        }
    }



        //val Intent=Intent(this,SecondryActivity::class.java)
        //startActivity(Intent)

}