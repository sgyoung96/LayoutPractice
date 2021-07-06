package com.example.animationpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter: MainAdapter? = null
    var data: MutableList<MainData>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = mutableListOf()

        data!!.apply {
            add(MainData("1"))
            add(MainData("2"))
            add(MainData("3"))
            add(MainData("4"))
            add(MainData("5"))
            add(MainData("6"))
            add(MainData("7"))
        }

        adapter = MainAdapter(this)

        adapter?.data = data!!
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = adapter
        adapter?.notifyDataSetChanged()
    }
}