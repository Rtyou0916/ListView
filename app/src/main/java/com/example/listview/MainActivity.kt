package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.adapters.StudentAdapter
import com.example.listview.datas.StudentData

class MainActivity : AppCompatActivity() {

//    학생 목록을 담을 그릇
    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(StudentData("최다영",1989,"서울시 강서구"))
        mStudentList.add(StudentData("권효영",1990,"서울시 동대문구"))
        mStudentList.add(StudentData("김정환",1991,"서울시 중랑구"))
        mStudentList.add(StudentData("김한균",1992,"서울시 노원구"))
        mStudentList.add(StudentData("이형종",1984,"서울시 도봉구"))
        mStudentList.add(StudentData("조경진",1985,"서울시 마포구"))
        mStudentList.add(StudentData("최민서",1986,"서울시 광진구"))
        mStudentList.add(StudentData("유석균",1987,"서울시 강남구"))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList )
    }
}