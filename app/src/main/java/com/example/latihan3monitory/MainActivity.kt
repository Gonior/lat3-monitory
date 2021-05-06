package com.example.latihan3monitory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

// Tanggal pengerjaan : 7 Mei 2021
// Deskripsi pengerjaan : membuat clone aplikasi monitory
// nim : 1011901
// nama : Dedi Cahya
// kelas : IF11K

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_main)

        btn_mulai.setOnClickListener() {
            intent = Intent(this, Code::class.java)
            startActivity(intent)
        }
    }
}