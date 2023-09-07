package com.rival.contohaplikasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtLength : TextInputLayout
    private lateinit var edtWidth : TextInputLayout
    private lateinit var edtHeight : TextInputLayout
    private lateinit var btnResult : Button
    private lateinit var tvResult : TextView
    private  lateinit var btnResIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edtLength = findViewById(R.id.edt_length)
        edtWidth = findViewById(R.id.edt_width)
        edtHeight = findViewById(R.id.edt_height)
        btnResult = findViewById(R.id.btn_result)
        tvResult = findViewById(R.id.tv_result)
        btnResIntent = findViewById(R.id.btn_result_intent)

        btnResult.setOnClickListener(this)
        btnResIntent.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        when (view?.id){
            R.id.btn_result -> {

                val getLength = edtLength.editText?.text.toString().trim()
                val getWidth = edtWidth.editText?.text.toString().trim()
                val getHeight = edtHeight.editText?.text.toString().trim()
                val msg = "Field ini harus diisi"

                var isError = false

                if (getLength.isEmpty()) {
                    edtLength.error = msg
                    isError = true
                    return
                } else {
                    edtLength.error = null

                }
                if (getWidth.isEmpty()) {
                    edtWidth.error = msg
                    isError = true
                    return
                } else {
                    edtWidth.error = null

                }
                if (getHeight.isEmpty()) {
                    edtHeight.error = msg
                    isError = true
                    return
                } else {
                    edtHeight.error = null

                }


                val result = getLength.toDouble() * getWidth.toDouble() * getHeight.toDouble()
                tvResult.text = result.toString()
            }
            R.id.btn_result_intent -> {
                val intent = Intent(this@MainActivity, ResultActivity::class.java)
                intent.putExtra(ResultActivity.DATA_RES, tvResult.text)
                startActivity(intent)
            }
        }

    }
}