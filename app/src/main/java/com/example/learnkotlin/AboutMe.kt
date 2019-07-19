package com.example.learnkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.learnkotlin.databinding.ActivityAboutMeBinding

class AboutMe : AppCompatActivity(), View.OnClickListener {

    private lateinit var doneButton: Button
    private lateinit var nickNameText: EditText
    private lateinit var nickName: TextView
    private lateinit var dataBinding: ActivityAboutMeBinding
    private var myName: MyName = MyName("kartik","kone")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_about_me)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_about_me)
        initView()
        dataBinding.nickNameTextView.text = myName.name
        dataBinding.doneButton.setOnClickListener(this)

    }

    private fun initView() {
//        doneButton = findViewById(R.id.done_button)
//        nickNameText = findViewById(R.id.nickName)
//        nickName = findViewById(R.id.nickNameTextView)
        dataBinding.nickNameTextView.visibility = View.GONE
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.done_button -> addNickname()
        }
    }

    private fun addNickname() {
        dataBinding.apply {
            dataBinding.doneButton.visibility = View.GONE
            //invalidateAll()
            dataBinding.nickNameTextView.text = dataBinding.nickName.text.toString()
            dataBinding.nickName.visibility = View.GONE
            dataBinding.nickNameTextView.visibility = View.VISIBLE


        }
    }
}