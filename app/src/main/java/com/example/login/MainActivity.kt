package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etEmail2:EditText
    lateinit var etPassWord2:EditText
    lateinit var btnLogin2:Button
    lateinit var btnSignup2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        login()
        signup()

    }
    fun castViews(){
        etEmail2=findViewById(R.id.etEmail2)
        etPassWord2=findViewById(R.id.etpassWord2)
        btnLogin2=findViewById(R.id.btnLogin2)
        btnSignup2=findViewById(R.id.btnSignup2)
    }
    fun login(){
        btnLogin2.setOnClickListener{
            val intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
    fun signup(){
        btnSignup2.setOnClickListener{
            val intent=Intent(baseContext,Signup::class.java)
            startActivity(intent)
        }
    }
}