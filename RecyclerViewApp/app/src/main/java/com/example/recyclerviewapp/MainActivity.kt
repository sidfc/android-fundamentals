package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var titles = mutableListOf<String>()
    private var descriptions = mutableListOf<String>()
    private var contents = mutableListOf<String>()
    private var images = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dummy_data()

        var recycler_view: RecyclerView = findViewById(R.id.recycler_view)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = RecyclerViewAdapter(titles, descriptions, contents, images)
    }

    fun dummy_data() {
        for (i in 1..100) {
            titles.add("title ${i}")
            descriptions.add("this is just a description")
            contents.add("this is the content of this card")
            images.add(R.drawable.ic_person)
        }
    }
}