package com.example.passandodados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_passa_dados.setOnClickListener {

            val intent = Intent(applicationContext, ReceiveDataActivity::class.java)

            //passar  dados

            intent.putExtra("nome", "Carlos Gustavo")
            intent.putExtra("idade", 30)

            startActivity(intent)
        }
    }
}
