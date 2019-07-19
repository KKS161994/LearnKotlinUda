package com.example.learnkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutMe:AppCompatActivity(),View.OnClickListener{

    lateinit var doneButton:Button
    lateinit var nickNameText:EditText
    lateinit var nickName: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        initView()

    }

    private fun initView() {
        doneButton = findViewById(R.id.done_button)
        nickNameText = findViewById(R.id.nickName)
        nickName = findViewById(R.id.nickNameTextView)
    }

    override fun onClick(p0: View?) {
           when(p0?.id){
               R.id.done_button -> addNickname()
           }
    }

    private fun addNickname() {
        doneButton.visibility = View.GONE
        nickName.text = nickNameText.text.toString()
    }
}