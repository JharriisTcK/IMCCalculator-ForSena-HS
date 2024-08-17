package com.example.imccalculatorforsena

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btHome=findViewById<ImageView>(R.id.imageHome)
        btHome.setOnClickListener {
            val intento=Intent(this, MainActivity::class.java)
            startActivity(intento)
        }

        val btUser=findViewById<ImageView>(R.id.imageUser)
        btUser.setOnClickListener {
            val intento= Intent(this, UserActivity::class.java)
            startActivity(intento)
        }

        val btIniciarSesion=findViewById<Button>(R.id.btLogin)
        btIniciarSesion.setOnClickListener {
            val intento=Intent(this, UserActivity::class.java)
            startActivity(intento)
        }

        val btRegistrar=findViewById<Button>(R.id.btRegistrar)
        btRegistrar.setOnClickListener {
            val intento=Intent(this, RegistroActivity::class.java)
            startActivity(intento)
        }
    }
}