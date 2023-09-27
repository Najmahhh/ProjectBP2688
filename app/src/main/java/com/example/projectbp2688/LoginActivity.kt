package com.example.projectbp2688

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instance
        val btnlogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText =findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val logModel = LoginModel()
        //event btn login di klik
        btnlogin.setOnClickListener {
            //input
            logModel.username= txtUsername.text.toString()
            logModel.password= txtPassword.text.toString()

            //valisasi login
            if(logModel.loginCek()== true){
            if (txtUsername.text.toString().equals("najmahhh") &&
                txtPassword.text.toString().equals("najmah")) {
                //panggil home activity
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this,"Username/Password Salah", Toast.LENGTH_SHORT).show()
            }
        }

    }
}}