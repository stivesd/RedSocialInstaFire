package com.example.instafire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class ImagenViewBigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen_view_big)

        val imageUrl = intent.getStringExtra("imageUrl")

        val ivBigImage: ImageView = findViewById(R.id.ivBigImage)

        Glide.with(this).load(imageUrl).into(ivBigImage)

    }
}