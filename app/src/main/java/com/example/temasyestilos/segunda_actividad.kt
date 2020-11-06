package com.example.temasyestilos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class segunda_actividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_actividad)
    }

    fun onClick(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
