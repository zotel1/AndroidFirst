package com.zoteldev.androidfirst.todoapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zoteldev.androidfirst.R

class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory) {

      //  tvCategoryName.text = "EJEMPLO"

        when(taskCategory) {
            TaskCategory.Personal -> {
                tvCategoryName.text = "Personal"
            }
            TaskCategory.Business -> {
                tvCategoryName.text = "Negocios"
            }
            TaskCategory.Other -> {
                tvCategoryName.text = "Otros"
            }
        }

    }
}