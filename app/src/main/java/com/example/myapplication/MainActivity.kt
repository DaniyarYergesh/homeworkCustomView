package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button as Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pinTextView = findViewById<PinTextViewGen>(R.id.pinTextViewGen)
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            pinTextView.append(1)
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            pinTextView.append(2)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            pinTextView.append(3)
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            pinTextView.append(4)
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            pinTextView.append(5)
        }

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            pinTextView.append(6)
        }

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            pinTextView.append(7)
        }

        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener {
            pinTextView.append(8)
        }

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener {
            pinTextView.append(9)
        }

        val buttonBack: Button = findViewById(R.id.back)
        buttonBack.setOnClickListener {
            pinTextView.clear()
        }
        buttonBack.setOnLongClickListener {
            pinTextView.clearAll()
            true
        }

        val button0: Button = findViewById(R.id.button0)
        button0.setOnClickListener {
            pinTextView.append(0)
        }

        val buttonOk: Button = findViewById(R.id.OK)
        buttonOk.setOnClickListener {
            pinTextView.checking()
        }
    }

}