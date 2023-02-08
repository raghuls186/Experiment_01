package com.example.e_01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fontsize:Float=5f
        var color=0
        var bg_color=0


        val toast=findViewById<TextView>(R.id.toast)
        val a=findViewById<TextView>(R.id.toast)
        val b=findViewById<Button>(R.id.font)
        val font=findViewById<Button>(R.id.font)
        val style=findViewById<Button>(R.id.style)
        val d_toast=findViewById<Button>(R.id.d_toast)
        val background=findViewById<Button>(R.id.background)
        val screen=findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.screen)


        font.setOnClickListener {
            fontsize=(fontsize+5)%50
            if(fontsize==0f){
                toast.textSize=5f
            }
            else{
                toast.textSize=fontsize
            }

        }

        style.setOnClickListener {
            if(color%3==0){
                toast.setTextColor(Color.RED)
            }
            if(color%3==1){
                toast.setTextColor(Color.GREEN)
            }
            if(color%3==2){
                toast.setTextColor(Color.BLUE)
            }
            color++

        }

        background.setOnClickListener {

            if(bg_color%3==0){
                screen.setBackgroundColor(Color.RED)
            }
            if(bg_color%3==1){
                screen.setBackgroundColor(Color.GREEN)
            }
            if(bg_color%3==2){
                screen.setBackgroundColor(Color.BLUE)
            }
            bg_color++
        }
        d_toast.setOnClickListener {
            Toast.makeText(this,"This is a Toast Message!",Toast.LENGTH_SHORT).show()

        }
    }
}