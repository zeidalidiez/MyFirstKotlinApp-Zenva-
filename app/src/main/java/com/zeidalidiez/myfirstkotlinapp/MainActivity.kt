package com.zeidalidiez.myfirstkotlinapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var colorInput: EditText? = null
    private var colorOutput: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        colorInput = findViewById<EditText>(R.id.colorInput)
        colorOutput = findViewById<TextView>(R.id.colorOutput)
    }
    fun updateColorText(view: View) {
    val color = colorInput?.text.toString().toLowerCase()
    when (color) {
        "blue" -> {
            colorOutput?.text = "You like Blue!"
            colorOutput?.setTextColor(Color.BLUE)
        }
        "black" -> {
            colorOutput?.text = "You like Black!"
            colorOutput?.setTextColor(Color.BLACK)
        }
        "red" -> {
            colorOutput?.text = "You like Red!"
            colorOutput?.setTextColor(Color.RED)
        }
        "green" -> {
            colorOutput?.text = "You like Green!"
            colorOutput?.setTextColor(Color.GREEN)
        }
        "purple" -> {
            colorOutput?.text = "You like Purple!"
            colorOutput?.setTextColor(Color.MAGENTA)
        }
        else -> {
                colorOutput?.text = "You hate colors!"
                colorOutput?.setTextColor(Color.DKGRAY)
        }
    }
    }
}

