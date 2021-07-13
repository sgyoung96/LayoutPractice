package com.example.changingdatabar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.round

/**
 * [1]
 * 초록색 막대 이미지 max 일 때 오른쪽 끝부분 둥근 이미지 제플린에 없음 -> 직사각형으로 대체
 * : bar_on_green_tail 없음 -> bar_on_green_body 로 대체
 * [2]
 * et_data EditText 에는 수치 혹은 '만료'가 입력됨
 * 단, 수치는 일수를 입력하지만 계산은 개월 수로 계산하여 막대 색상 변경함
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 기본 셋팅
        et_data.setText("만료")
        et_data.setTextColor(getColor(R.color.red))
        tv_text.text = "되었습니다."
        vg_bar.visibility = View.INVISIBLE
        iv_tall.visibility = View.VISIBLE

        // 데이터 입력 후 버튼 클릭
        btn_cal.setOnClickListener {
            if (et_data.text.toString() == "만료") {
                et_data.setTextColor(getColor(R.color.red))
                tv_text.text = "되었습니다."
                vg_bar.visibility = View.INVISIBLE
                iv_tall.visibility = View.VISIBLE
            } else {
                et_data.setTextColor(getColor(R.color.black))
                tv_text.text = "일 남았습니다."
                vg_bar.visibility = View.VISIBLE
                iv_tall.visibility = View.INVISIBLE
                // 수치에 따라 계산하여 et_data 색상 바꾸고, imageView 의 이미지들 바꾸기 (if 구문 사용)

                val period = et_data.text.toString().toDouble()    // 일 수
                val month: Double = period / 30                    // 일 수로 계산한 개월 수
                val roundedMonth = round(month)

                if (roundedMonth in 0.0..3.0) {
                    // 1개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_red_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 6.0) {
                    // 2개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 9.0) {
                    // 3개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 12.0) {
                    // 4개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 15) {
                    // 5개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 18.0) {
                    // 6개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 21.0) {
                    // 7개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 24.0) {
                    // 8개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 27.0) {
                    // 9개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 30.0) {
                    // 10개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 33.0) {
                    // 11개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_off_body))
                } else if (roundedMonth <= 36.0) {
                    // 12개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                } else {
                    // 12개
                    iv_1.setImageDrawable(getDrawable(R.drawable.bar_on_green_head))
                    iv_2.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_3.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_4.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_5.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_6.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_7.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_8.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_9.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_10.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_11.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                    iv_12.setImageDrawable(getDrawable(R.drawable.bar_on_green_body))
                }
            }
        }
    }
}


/*
1.
et_data 가 '만료' 일 시, tv_text 는 '되었습니다.'
- vg_bar.visibility = View.INVISIBLE
- iv_tall.visibility = View.VISIBLE

et_data 가 '만료'가 아닐 시, tv_text 는 '일 남았습니다.'
- vg_bar.visibility = View.VISIBLE,
- iv_1 ~ iv_12 의 이미지 소스 변경 (수치에 따라 계산 넣어서 이미지 소스 변경)
- iv_tall.visibility = View.INVISIBLE

 */