package com.example.passandodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_receive_data.*

class ReceiveDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_data)

        val dados: Bundle = intent.extras!!
        val nome = dados.getString("nome")
        val idade: Int = dados.getInt("idade")
        text_nome.text = nome
        text_idade.text = idade.toString()
    }
}
