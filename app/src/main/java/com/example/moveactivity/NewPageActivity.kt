package com.example.moveactivity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class NewPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_page)

        val tvUserName: TextView = findViewById(R.id.tv_user_name)
        val tvUserAge: TextView = findViewById(R.id.tv_user_age)
        val tvUserGender: TextView = findViewById(R.id.tv_user_gender)
        val tvUserAddress: TextView = findViewById(R.id.tv_user_address)
        val ivUserPhoto: ImageView = findViewById(R.id.iv_user_photo)

        // Terima data dari intent
        val userName = intent.getStringExtra("user_name") ?: ""
        val userAge = intent.getIntExtra("user_age", 0)
        val userGender = intent.getStringExtra("user_gender") ?: ""
        val userAddress = intent.getStringExtra("user_address") ?: ""

        // Tampilkan data di tata letak
        tvUserName.text = getString(R.string.name_placeholder, userName)
        tvUserAge.text = getString(R.string.age_placeholder, userAge)
        tvUserGender.text = getString(R.string.gender_placeholder, userGender)
        tvUserAddress.text = getString(R.string.address_placeholder, userAddress)

        // Tampilkan foto (anda mungkin memerlukan library seperti Picasso atau Glide untuk ini)
        // Contoh penggunaan placeholder untuk src
        ivUserPhoto.setImageResource(R.drawable.hani_meletup)
        // Implementasi memuat gambar dari URL ke ImageView disini (gunakan Picasso atau Glide)
    }
}


