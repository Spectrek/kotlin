package io.github.spectrek.mykotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val txtGreeting: TextView = findViewById(R.id.greeting)
        txtGreeting.text = "Hello everyone!"
    }
}
