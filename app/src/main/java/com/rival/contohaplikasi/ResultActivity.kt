package com.rival.contohaplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rival.contohaplikasi.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var tvRes : TextView

    companion object{
        const val DATA_RES = "data_res"
    }

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvRes = binding.tvRes

        val dataFromRes = intent.getStringExtra(DATA_RES)

        tvRes.text = dataFromRes


    }
}