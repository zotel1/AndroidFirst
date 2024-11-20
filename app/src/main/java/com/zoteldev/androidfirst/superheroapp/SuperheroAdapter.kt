package com.zoteldev.androidfirst.superheroapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zoteldev.androidfirst.R


class SuperheroAdapter(var superheroList: List<SuperheroItemResponse> = emptyList()) :
    RecyclerView.Adapter<SuperheroViewHolder>() {

        fun updateList(superHeroList: List<SuperheroItemResponse>)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        viewholder.bind(superheroList[position])
    }

    override fun getItemCount() = superheroList.size

}