package com.example.animationpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val context: Context): RecyclerView.Adapter<MainViewHolder>() {

    var data = mutableListOf<MainData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(data!![position])
    }

    override fun getItemCount(): Int {
        return data!!.size
    }

    companion object {
        var isScrolling = false //패스트 스크롤시 오픈된 카드를 닫기 위한 플래그
        var isExpanded = true //true :  펼쳐보기,  false: 모아보기

    }
}