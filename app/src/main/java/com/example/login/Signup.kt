package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.*
import java.net.PasswordAuthentication
import javax.security.auth.callback.PasswordCallback

class Signup : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var spGender: Spinner
    lateinit var etEmail: EditText
    lateinit var etPhoneNumber: EditText
    lateinit var etPassWord: EditText
    lateinit var btnSignup: Button
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castViews()
        Signup()
        login()

    }

    fun castViews() {
        etName = findViewById(R.id.etName)
        spGender = findViewById(R.id.spGender)
        etEmail = findViewById(R.id.etEmail)
        etPassWord = findViewById(R.id.etPassword)
        etPhoneNumber = findViewById(R.id.etphoneNumber)
        btnSignup = findViewById(R.id.btnSignup)
        btnLogin = findViewById(R.id.btnLogin)

        val gender = arrayOf("female", "male", "Other")
        val adapter = ArrayAdapter<String>(baseContext, android.R.layout.simple_spinner_item)
        spGender .adapter=adapter

        signUp()
        login()
    }

    fun signUp() {
        btnSignup.setOnClickListener {
            val intent = Intent(baseContext, Signup::class.java)
            startActivity(intent)
        }


    }

    fun login() {
        btnLogin.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
        }
    }
}
