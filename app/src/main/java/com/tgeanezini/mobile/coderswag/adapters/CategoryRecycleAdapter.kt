package com.tgeanezini.mobile.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.tgeanezini.mobile.coderswag.R
import com.tgeanezini.mobile.coderswag.models.Category

class CategoryRecycleAdapter(private val context: Context, private val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindCategory(categories[position], context)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title
        }
    }
}