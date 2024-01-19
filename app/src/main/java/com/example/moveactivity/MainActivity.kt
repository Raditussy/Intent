package com.example.moveactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

        val btnNewPage: Button = findViewById(R.id.btn_new_page)
        btnNewPage.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Sigma Male")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }

            R.id.btn_dial_number -> {
                val phoneNumber = "081210841382"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }

            R.id.btn_new_page -> {
                // Data pengguna
                val userName = "Hani Cynthia Alamsyah"
                val userAge = 16
                val userGender = "Female"
                val userAddress = "Deket rumah Juan"
                val userPhotoUrl = "https://example.com/photo.jpg"

                val newPageIntent = Intent(this@MainActivity, NewPageActivity::class.java)
                newPageIntent.putExtra("user_name", userName)
                newPageIntent.putExtra("user_age", userAge)
                newPageIntent.putExtra("user_gender", userGender)
                newPageIntent.putExtra("user_address", userAddress)
                newPageIntent.putExtra("user_photo_url", userPhotoUrl)
                startActivity(newPageIntent)
            }
        }
    }
}
