package com.zoteldev.androidfirst.todoapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CategorysAdapter(private val categories: List<TaskCategory>) :
    RecyclerView.Adapter<CategoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = categories.size

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}