package com.example.layoutpractice

import android.content.Context
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

// ConstraintLayout 에 4가지 constructor 가 있는데, ConstraintLayout 은 생성자를 정의해 줘야 한다.
class NumInputView: ConstraintLayout, View.OnClickListener {

    constructor(context: Context) : super(context)

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}