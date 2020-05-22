package com.example.firstforyou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello.setOnClickListener {
            Toast.makeText(this, "как дела?)", Toast.LENGTH_SHORT).show()
        }

        val s: TextView = findViewById<TextView>(R.id.email)

        email.setOnClickListener {
            Toast.makeText(this, "введи e-mail , дружок :)", Toast.LENGTH_SHORT).show()
            val str: Boolean = s.text.contains(
                "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}\$\n" +
                        "\n"
            )
        }

        password.setOnClickListener {
            Toast.makeText(this, "а теперь пароль", Toast.LENGTH_SHORT).show()
        }

        enter.setOnClickListener {
            val emailText: TextView = findViewById<TextView>(R.id.email)
            val strEmail: Boolean = emailText.text.contains(
                "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}\$\n" +
                        "\n"
            )
            val passwordText: TextView = findViewById(R.id.password) as TextView
//            val strPassword: Boolean = passwordText.text.contains("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$")
            val strPassword: Boolean =
                passwordText.text.contains("(?!^[0-9]*\$)(?!^[a-zA-Z]*\$)^([a-zA-Z0-9]{6,})\$")
            if (!strEmail) {
                Toast.makeText(this, "дружочек, введи правильный e-mail", Toast.LENGTH_SHORT).show()
            }
            if (!strPassword) {
                Toast.makeText(this, "дружочек, введи правильный пароль", Toast.LENGTH_SHORT).show()

            }


        }


    }
}

