package com.example.customkeypadpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_custom_num_keypad.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var result: String = ""

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {
            result += "0"
            setText(result)
        }
        num1.setOnClickListener {
            result += "1"
            setText(result)
        }
        num2.setOnClickListener {
            result += "2"
            setText(result)
        }
        num3.setOnClickListener {
            result += "3"
            setText(result)
        }
        num4.setOnClickListener {
            result += "4"
            setText(result)
        }
        num5.setOnClickListener {
            result += "5"
            setText(result)
        }
        num6.setOnClickListener {
            result += "6"
            setText(result)
        }
        num7.setOnClickListener {
            result += "7"
            setText(result)
        }
        num8.setOnClickListener {
            result += "8"
            setText(result)
        }
        num9.setOnClickListener {
            result += "9"
            setText(result)
        }
        iv_num_delete.setOnClickListener {
            if (result.length > 1) {
                result = result.removeRange(result.length - 1 until result.length)
                setText(result)
            } else {
                result = ""
                setText(result)
            }

        }
        num_clear.setOnClickListener {
            result = ""
            setText(result)
        }
    }

    private fun setText(result: String) {
        et_numpad_input.setText(result)
    }
}