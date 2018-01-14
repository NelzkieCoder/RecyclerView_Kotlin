package com.example.skadush.kotlin_recyclerview.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.skadush.kotlin_recyclerview.Adapters.CategoryAdapter
import com.example.skadush.kotlin_recyclerview.Adapters.CategoryRecylerAdapter
import com.example.skadush.kotlin_recyclerview.Model.Category
import com.example.skadush.kotlin_recyclerview.R
import com.example.skadush.kotlin_recyclerview.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecylerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecylerAdapter(this, DataService.Categories){
            category ->  Toast.makeText(this,category.title,Toast.LENGTH_SHORT).show()
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
}
