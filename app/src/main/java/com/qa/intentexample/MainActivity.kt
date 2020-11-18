package com.qa.intentexample


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.expBtn).setOnClickListener {
            val newIntent = Intent(this, OtherScreen::class.java)
            startActivity(newIntent)
            finish()

        }
        findViewById<Button>(R.id.impBtn).setOnClickListener {
            val newIntent = Intent(Intent.ACTION_SEND)
            newIntent.putExtra(Intent.EXTRA_TEXT, "Put this in a msg! ")
            newIntent.type = "text/plain"
            startActivity(newIntent)

        }



    }
}