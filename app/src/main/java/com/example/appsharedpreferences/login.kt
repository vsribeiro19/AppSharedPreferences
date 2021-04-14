package com.example.appsharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sp = getSharedPreferences("login", Context.MODE_PRIVATE)


        val login = sp.getString("LOGIN", "")
        val senha = sp.getString("SENHA", "")

        //atualizaLogin(sp)
    }

    private fun atualizaLogin(sp: SharedPreferences) {
        val res = sp.getString("ultimo_login", "no")

        if (res.equals("no")) {
            txtUltimoLogin.text = "Não foi efetuado login até o momento"
        } else {
            txtUltimoLogin.text = res
        }
    }

}
