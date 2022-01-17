package com.example.homeworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

   fun initView() {
       btn_signup.setOnClickListener() {
           val name = et_name.text.toString()
           val password = et_password.text.toString()
           Toast.makeText(this, name + " " + password, Toast.LENGTH_SHORT).show()

           val data = Data(name,password)
            sendData(data)
       }
   }
    fun sendData(data: Data){


        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("data_sent",data)
        startActivity(intent)
    }
}