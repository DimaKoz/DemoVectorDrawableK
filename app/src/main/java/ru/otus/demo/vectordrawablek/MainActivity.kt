package ru.otus.demo.vectordrawablek

import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val imgView = findViewById<AppCompatImageView>(R.id.imageView)

        val lDrawable : Drawable? = if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ContextCompat.getDrawable(this, R.drawable.ic_desktop_mac_24px)
        } else {
            resources.getDrawable(R.drawable.ic_desktop_mac_24px)
        }
        imgView.setImageDrawable(lDrawable)

    }
}
