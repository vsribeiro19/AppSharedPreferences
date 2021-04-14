package com.example.appsharedpreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("login", Context.MODE_PRIVATE)

        btnSalvarCadastro.setOnClickListener{
            val login = edtCriaLogin.text.toString()
            val senha = edtCriaSenha.text.toString()

            val editor: SharedPreferences.Editor = sp.edit()
            editor.putString("LOGIN", login)
            editor.putString("SENHA", senha)
            editor.apply()

            Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }

    }
}
