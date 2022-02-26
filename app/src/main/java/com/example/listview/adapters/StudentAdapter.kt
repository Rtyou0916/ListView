package com.example.listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listview.R
import com.example.listview.datas.StudentData

class StudentAdapter(
    val mContext: Context,  //어느 화면에서?
    val resId: Int,  // 어떤 xml을 기반으로 그려줄거니?
    val mList: ArrayList<StudentData> // 실제로 뿌려줄 학생들은 누구니, 목록

    ) : ArrayAdapter<StudentAdapter>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)

        }

        val row = tempRow!!

//        각 row UI에 > 자리에 맞는 사람 데이터를 반영.

        val txtStudentName = row.findViewById<TextView>(R.id.txtStudentName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)

        txtStudentName.text = data.name
        txtAddress.text = data.address


        val age = 2022 - data.birthYear + 1
        txtAge.text = "(${data.birthYear}세)"






        val data = mList[position]

//        row의 텍스트뷰 등등에 data 변수가 가진 하위 정보들을 반영






//        반영된 채로 결과 나가게

        return row




    }

}