package com.rival.contohaplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var tvRes : TextView

    companion object{
        const val DATA_RES = "data_res"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvRes = findViewById(R.id.tv_res)

        val dataFromRes = intent.getStringExtra(DATA_RES)

        tvRes.text = dataFromRes


    }
}