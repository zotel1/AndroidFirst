package com.zoteldev.androidfirst.superheroapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class SuperheroAdapter (var superHeroList: List<SuperHeroItemResponse> = emptyList()) :
    RecyclerView.Adapter<SuperHeroViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {

        }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
viewholder.bind(superheroList[position])
    }

    override fun getItemCount() = superheroList.size
    }