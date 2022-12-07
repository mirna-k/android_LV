package com.mirnakrpic.orwima_lv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imeText = findViewById<TextView>(R.id.nameText)
        val opisText = findViewById<TextView>(R.id.opisText)

        val unesiButton = findViewById<Button>(R.id.unesiButton)
        val calculateButton = findViewById<Button>(R.id.IzracunajButton)

        val imeInput = findViewById<EditText>(R.id.nameEditText)
        val opisInput = findViewById<EditText>(R.id.opisEditText)

        val visinaInput = findViewById<EditText>(R.id.visinaEditText)
        val tezinaInput = findViewById<EditText>(R.id.tezinaEditText)

        val bmiText = findViewById<TextView>(R.id.BMIText)

        unesiButton.setOnClickListener(){
            imeText.text = imeInput.getText().toString()
            opisText.text = opisInput.getText().toString()
        }

        calculateButton.setOnClickListener(){
            var bmi : Float = tezinaInput.getText().toString().toFloat() / (visinaInput.getText().toString().toFloat()/100).pow(2)
            bmiText.text = bmi.toString()
            Toast.makeText(this@MainActivity, bmiText.text, Toast.LENGTH_SHORT).show()
        }
    }
}