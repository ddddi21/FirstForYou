package com.example.firstforyou

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val s = application.assets.open("Names").bufferedReader().use{
            it.readLine()
        }
        val infName = "name"
        val infSurname = "suriname"
        val infEmail = "email"
        val intPsw = "password"

        var preferences: SharedPreferences = getSharedPreferences("Names", Context.MODE_PRIVATE)
         fun rememberName (name:String) {
            val editor = preferences.edit()
            editor.putString(infEmail,name).apply()
        }

        fun rememberSuriname (name:String) {
            val editor = preferences.edit()
            editor.putString(infEmail,name).apply()
        }

        fun rememberEmail (name:String) {
            val editor = preferences.edit()
            editor.putString(infEmail,name).apply()
        }

        fun getName(name:String) :String? = preferences.getString(infName,name)
        fun getSuriname(name:String) :String? = preferences.getString(infSurname,name)
        fun getEmail(name:String) :String? = preferences.getString(infEmail,name)

        //я хотела сохранять данные пользователя, чтобы при авторизации, ему не пришлось каждый раз вбивать данные снова
        //но опять-таки мне не хватило времени на то, чтобы разобраться и доделать

    }


}
