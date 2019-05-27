package com.tgeanezini.mobile.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.tgeanezini.mobile.coderswag.R
import com.tgeanezini.mobile.coderswag.adapters.CategoryAdapter
import com.tgeanezini.mobile.coderswag.models.Category
import com.tgeanezini.mobile.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoriesListView.adapter = adapter
    }
}
