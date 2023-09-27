package com.example.projectbp2688

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instance
        val btnlogin:Button = findViewById(R.id.buttonLogin)
        //event btn login di klik
        btnlogin.setOnClickListener {
            //panggil home activity
            val intentHome = Intent(this,HomeActivity::class.java)
            startActivity(intentHome)
        }

    }
}