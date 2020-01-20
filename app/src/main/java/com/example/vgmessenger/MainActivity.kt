package com.example.vgmessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = email_edittext_registration.text.toString()
        val password  = password_edittext_registration.text.toString()


        Log.d("MainActivity", "Email is:" + email)
        Log.d("MainActivity", "Password: $password")
    }
}
