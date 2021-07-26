package com.example.refreshview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        swipe_container.setOnRefreshListener {
            // 새로고침 내용
            tv_text.setBackgroundColor(Color.WHITE)

            // 이거 반드시 해줘야 함
            swipe_container.isRefreshing = false
        }
    }
}