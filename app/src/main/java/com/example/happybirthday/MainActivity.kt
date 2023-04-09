package com.example.happybirthday

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import pl.droidsonroids.gif.GifDrawable


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById<View>(R.id.birthdayCake) as ImageView
        val gifDrawable = GifDrawable(resources, R.drawable.happy_birthday_birthday_cake)
        imageView.setImageDrawable(gifDrawable)

    }
}