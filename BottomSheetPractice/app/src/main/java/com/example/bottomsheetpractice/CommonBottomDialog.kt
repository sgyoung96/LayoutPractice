package com.example.bottomsheetpractice

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.Nullable
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class CommonBottomDialog: BottomSheetDialogFragment() {

    var dlgView: View? = null
    var screenId: Int = 0

    interface FragmentListener {
        fun getView(view: View?)
    }

    companion object {
        var mFragmentListener: FragmentListener? = null
        fun newInstance(listener: FragmentListener?): CommonBottomDialog? {
            mFragmentListener = listener
            return CommonBottomDialog()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setStyle(DialogFramgment.STYLE_NORMAL, R.style.~~)
    }

    /**
     * screenId 를 어디서 받아오지?
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // return super.onCreateView(inflater, container, savedInstanceState)
        dlgView = inflater.inflate(screenId, container, false) // resource: Int, container: ViewGroup, attachToRoot: Boolean

        if (screenId == R.layout.bottom_sheet_1) {
            // 처리
        } else if (screenId == R.layout.bottom_sheet_2) {
            // 처리
        } else if (screenId == R.layout.bottom_sheet_3) {
            // 처리
        }
        return dlgView
    }

    /**
     * 뷰가 생성될 때 리스너 등록해 줘야 함
     * Interface 를 통해서 MainActivity 의 getView 함수와 연결됨 -> MainActivity 에 view 가 무엇인지 넘겨줌
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mFragmentListener?.getView(view)
    }

    // BottomSheetDialogFragment() 로부터 온 함수
    override fun getTheme(): Int {
        // return super.getTheme()
        return R.style.BottomSheetDialogRounded
    }

    // BottomSheetDialogFragment() 로부터 온 함수
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // return super.onCreateDialog(savedInstanceState)
        val dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        val arg = arguments
        screenId = arg!!.getInt("ScreenID")

        return dialog
    }
}