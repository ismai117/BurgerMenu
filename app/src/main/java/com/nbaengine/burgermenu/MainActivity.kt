package com.nbaengine.burgermenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         place_order.setOnClickListener {
             val getMeatRadioGroupId = radioGroup.checkedRadioButtonId
             val getSaladRadioGroupId = radioGroup2.checkedRadioButtonId
             val getSauceRadioGroupId = radioGroup3.checkedRadioButtonId

             val meat = findViewById<RadioButton>(getMeatRadioGroupId)
             val salad = findViewById<RadioButton>(getSaladRadioGroupId)
             val sauce = findViewById<RadioButton>(getSauceRadioGroupId)

             val order = "You ordered a ${meat.text} Burger with ${salad.text} & ${sauce.text}"

              Log.d("order", order)

         }

    }
}