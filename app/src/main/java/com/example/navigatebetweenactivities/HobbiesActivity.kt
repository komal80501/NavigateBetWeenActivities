package com.example.navigatebetweenactivities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_hobbies.*
import kotlinx.android.synthetic.main.activity_main.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL

        recyclerView.layoutManager=layoutManager

        val adapter =HobbiesAdapter(this,Supplier.hobbies)
        recyclerView.adapter=adapter

    }
}
