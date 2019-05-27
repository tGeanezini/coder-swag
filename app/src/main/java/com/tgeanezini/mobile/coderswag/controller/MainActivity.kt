package com.tgeanezini.mobile.coderswag.controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.tgeanezini.mobile.coderswag.R
import com.tgeanezini.mobile.coderswag.adapters.CategoryRecycleAdapter
import com.tgeanezini.mobile.coderswag.services.DataService
import com.tgeanezini.mobile.coderswag.utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {category ->
            val intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(intent)
        }
        categoriesListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoriesListView.layoutManager = layoutManager
        categoriesListView.setHasFixedSize(true)


    }
}
