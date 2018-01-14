package com.example.skadush.kotlin_recyclerview.Adapters

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.skadush.kotlin_recyclerview.Model.Category
import com.example.skadush.kotlin_recyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class CategoryRecylerAdapter(val context: Context, val categories : List<Category>, val itemClick : (Category) -> Unit )
    : RecyclerView.Adapter<CategoryRecylerAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
      val view : View = LayoutInflater.from(context)
              .inflate(R.layout.category_list_item,parent,false)

        val holder  =  Holder(view, itemClick)
        return holder
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
       holder?.bindCategory(categories[position], context)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.category_image)
        val categoryName = itemView?.findViewById<TextView>(R.id.category_name)


        fun bindCategory(category : Category, context: Context){

            val resId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resId)
            categoryName?.text = category.title

            itemView.setOnClickListener { itemClick(category ) }
        }
    }

}