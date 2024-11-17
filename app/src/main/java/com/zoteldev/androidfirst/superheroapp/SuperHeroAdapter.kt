package com.zoteldev.androidfirst.superheroapp

import android.view.ViewGroup
import androidx.recyclerView.widget.RecyclerView


class SuperheroAdapter (var superHeroList: List<SuperHeroItemResponse> = emptyList()) :
    RecyclerView.Adapter<SuperHeroViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {

        }
    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }
    }