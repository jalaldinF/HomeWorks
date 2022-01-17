package com.example.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        initView()

    }

    fun initView(){
        val som = intent.getParcelableExtra<Data>("data_sent")
        val str = som?.name.toString() + " " + som?.password.toString()
        tv_just.text = str

    }
}