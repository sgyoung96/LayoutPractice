package com.example.bottomsheetpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CommonBottomDialog.FragmentListener {

    var nBottomSheetMode = 0

    var commonBottomSheet: CommonBottomDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_show_bottom_sheet_1.setOnClickListener {
            nBottomSheetMode = 1
            showBottomSheet()
        }
        tv_show_bottom_sheet_2.setOnClickListener {
            nBottomSheetMode = 2
            showBottomSheet()
        }
        tv_show_bottom_sheet_3.setOnClickListener {
            nBottomSheetMode = 3
            showBottomSheet()
        }

        CommonBottomDialog.newInstance(this)
    }

    override fun getView(view: View?) {
        // onCreate 함수 getInstance 참조
        when (nBottomSheetMode) {
            1 -> {
                Toast.makeText(this, "1 번!!!", Toast.LENGTH_SHORT).show()
            }
            2 -> {
                Toast.makeText(this, "2 번!!!", Toast.LENGTH_SHORT).show()
            }
            3 -> {
                Toast.makeText(this, "3 번!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun showBottomSheet() {

        when (nBottomSheetMode) {
            1 -> callDialog(R.layout.bottom_sheet_1)
            2 -> callDialog(R.layout.bottom_sheet_2)
            3 -> callDialog(R.layout.bottom_sheet_3)
        }

    }

    fun callDialog(screenId: Int) {
        val dlgbundle = Bundle()
        dlgbundle.putInt("ScreenID", screenId)

        commonBottomSheet = CommonBottomDialog()
        commonBottomSheet?.arguments = dlgbundle
        commonBottomSheet?.show(supportFragmentManager, commonBottomSheet?.tag)
    }
}