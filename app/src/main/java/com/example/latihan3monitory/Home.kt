package com.example.latihan3monitory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.home_layout.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()

        setContentView(R.layout.home_layout)
        var name = intent.getStringExtra("name").toString()

        resultTV.text = "Beres! Sekarang $name udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)"


    }

}