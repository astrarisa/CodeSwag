package com.astraris.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.astraris.coderswag.Adapters.CategoryAdapter
import com.astraris.coderswag.Adapters.CategoryRecycleAdapter
import com.astraris.coderswag.Model.Category
import com.astraris.coderswag.R
import com.astraris.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter  //declare our adapter that will provide data to listView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //There is 3 things that we need to pass to ArrayAdapter:
        //1 - Context
        //2 - Type of view that it is going to be serving up to the list view
        //3 - Data that it is adapting
        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)



/*        //Adding click listener for the listview
        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }*/
    }
}
