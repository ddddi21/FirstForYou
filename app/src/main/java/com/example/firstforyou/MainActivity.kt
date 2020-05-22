package com.example.firstforyou

import android.content.Intent
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
            val strPassword: Boolean =
                passwordText.text.contains("(?:[a-z0-9!#\$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#\$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
            if(!strEmail and !strPassword) {
                Toast.makeText(this, "дружочек, введи правильный e-mail и пароль", Toast.LENGTH_SHORT).show()
            } else {
            if (!strEmail) {
                Toast.makeText(this, "дружочек, введи правильный e-mail", Toast.LENGTH_SHORT).show()
            } else {
                if (!strPassword) {
                    Toast.makeText(this, "дружочек, введи правильный пароль", Toast.LENGTH_SHORT)
                        .show()

                }
            }
            }
            if (strEmail and strPassword) { //здесь должна быть проверка на зашитые данные пользователя и соответсвенно их отображение во втором активити,
                                            //и переход к нему, но я не успела
                val go = Intent(this, Profile::class.java)
                startActivity(go)

            }
        }


    }
}

