package com.astraris.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.astraris.coderswag.Model.Category
import com.astraris.coderswag.R
import com.astraris.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>  //declare our adapter that will provide data to listView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //There is 3 things that we need to pass to ArrayAdapter:
        //1 - Context
        //2 - Type of view that it is going to be serving up to the list view
        //3 - Data that it is adapting
        adapter = ArrayAdapter(this,       //1-Context
            android.R.layout.simple_list_item_1, //2-There are different type views under "android.R.layout.---"
            DataService.categories)              //3-Data that is adapting

        categoryListView.adapter = adapter
    }
}
