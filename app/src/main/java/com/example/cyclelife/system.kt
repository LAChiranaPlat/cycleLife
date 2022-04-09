package com.example.cyclelife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.cyclelife.databinding.ActivitySystemBinding

class system : AppCompatActivity() {

    lateinit var layout:ActivitySystemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivitySystemBinding.inflate(layoutInflater)

        setContentView(layout.root)

        var user=intent.getStringExtra("usuario")
        Log.i("result",intent.getStringExtra("idApp").toString())

        layout.txtUser.text=user
    }
}