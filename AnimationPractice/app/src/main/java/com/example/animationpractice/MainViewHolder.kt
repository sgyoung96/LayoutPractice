package com.example.animationpractice

import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val text = itemView.findViewById<TextView>(R.id.tv_text)

    fun bind(data: MainData) {
        text.text = data.text
    }

    // TODO : 애니메이션 처리 어떻게 하는지 모르겠다...
//    fun selectedItem(card: NewCard, selected: Boolean) {
//        itemBinding.llSubMenu?.apply {
//            changeVisibility(this, newCard.isSelect)
//        }
//    }

    fun changeVisibility(view: View, isSelect: Boolean) {
        if (!MainAdapter.isScrolling) {
            if (MainAdapter.isExpanded) {
                // 미선택 메뉴 보일 경우
                if (!isSelect && view.visibility == View.VISIBLE) {
                    view.visibility = View.GONE
                } else if (isSelect && view.visibility == View.GONE) {
                    val animation: Animation = AnimationUtils.loadAnimation(view.context, R.anim.slide_left_to_right)
                    view.startAnimation(animation)
                } else {
                    view.visibility = if (isSelect) View.VISIBLE else View.GONE
                }
            } else {
                // 미선택 메뉴 보일 경우
                if (!isSelect && view.visibility == View.VISIBLE) {
                    val animation: Animation = AnimationUtils.loadAnimation(view.context, R.anim.slide_bottom_to_top)
                    view.visibility = View.GONE
                } else if (isSelect && view.visibility == View.GONE) {
                    val animation: Animation = AnimationUtils.loadAnimation(view.context, R.anim.slide_top_to_bottom)
                    view.visibility = View.VISIBLE
                } else {
                    view.visibility = if (isSelect) View.VISIBLE else View.GONE
                }
            }
        } else {
            view.clearAnimation()
            view.visibility = View.GONE
        }
    }
}