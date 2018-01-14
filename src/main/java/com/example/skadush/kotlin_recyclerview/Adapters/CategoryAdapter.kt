package com.example.skadush.kotlin_recyclerview.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.skadush.kotlin_recyclerview.Model.Category
import com.example.skadush.kotlin_recyclerview.R

class CategoryAdapter(val context:Context, val categories: List<Category>) : BaseAdapter() {



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView : View
        val holder : ViewHolder


        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder = ViewHolder()
            holder.catergoryName  = categoryView.findViewById(R.id.category_name)
            holder.categoryImage  = categoryView.findViewById(R.id.category_image)

            categoryView.tag = holder

        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView

        }



        val category = categories[position]
        holder.catergoryName?.text = category.title

        val resId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resId)

        println(resId)
        return  categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
       return categories.size
    }

    private class ViewHolder{
        var categoryImage : ImageView? = null
        var catergoryName: TextView? = null
    }
}