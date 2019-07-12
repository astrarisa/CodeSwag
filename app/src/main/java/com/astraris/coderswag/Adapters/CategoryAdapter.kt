package com.astraris.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.astraris.coderswag.Model.Category
import com.astraris.coderswag.R

//Inherit class BaseAdapter. Implement members by pressing alt+enter

class CategoryAdapter (context: Context, category: List<Category>) : BaseAdapter() {

    val context = context
    val category = category

    //Every adapter that inherits from this adapter needs to have 4 of the methods bolow
    //position - Number that corresponds to specific row that is being displayed
    //convertView - View that is being displayed over and over
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View

        //LayoutInflater is an object that takes an XML layout(like in out layout folder) and
        //turns it into an actual view that we can use in code
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryItem : ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)

        val category = category[position]

        //convert image name to resource id
        val recourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryItem.setImageResource(recourceId)
        println(recourceId)

        categoryName.text = category.title
        return categoryView

    }

    //This is the method that we call to retrieve(извелекать) the item that is associated(связан) with the position
    //at that position that the listView is happend to be positioned to be at
    override fun getItem(position: Int): Any {
        return category[position]
    }

    //Method that defines a unique ID for each row
    override fun getItemId(position: Int): Long {
        return 0
    }

    //This function is telling the listView how many row is going to be displaying
    override fun getCount(): Int {
        return category.count() //returning the number of categories in categories array
    }
}