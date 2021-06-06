//package com.example.login
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.provider.ContactsContract
//import android.widget.EditText
//import android.widget.Toast
//
//class Login : AppCompatActivity() {
//    lateinit var btnLogin: Login
//    lateinit var btnSignup:Signup
//    lateinit var etEmail: EditText
//    lateinit var etPassword: EditText
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//        castingViews()
//        onClickListener()
//    }
//
//    fun castingViews() {
//        btnLogin = findViewById(R.id.btnLogin)
//        btnSignup = findViewById(R.id.btnSignin)
//        etEmail = findViewById(R.id.etEmail)
//        etPassword =findViewById(R.id.etPassword)
//    }
//
//    fun onClickListener() {
//        if (etEmail.text.toString().isEmpty() || (etPassword.text.toString().isEmpty())) {
//            etEmail.setError("Empty email")
//            etPassword.setError("Empty Password")
//        }
//        var feedBack = "You are welcome"
//        btnLogin.setonClickListener{
//            Toast.makeText(baseContext, feedBack, Toast.LENGTH_LONG).show()
//        }
//        btnSignup.setOnClicklistener{
//            var intent = Intent(baseContext, Signup::class.java)
//            startActivity(intent)
//        }
//    }
//}