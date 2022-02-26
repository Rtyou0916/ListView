package com.example.listview.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listview.datas.StudentData

class StudentAdapter(
    val mContext: Context,  //어느 화면에서?
    val resId: Int,  // 어떤 xml을 기반으로 그려줄거니?
    val mList: ArrayList<StudentData> // 실제로 뿌려줄 학생들은 누구니, 목록


): ArrayAdapter<StudentAdapter>(mContext,resId,mList) {





}