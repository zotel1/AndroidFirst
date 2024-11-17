package com.zoteldev.androidfirst.superheroapp

import io.netty.util.Recycler

class SuperHeroAdapter (var superHeroList: List<SuperHeroItemResponse> = emptyList()) : RecyclerView.Adapter<SuperHeroViewHolder>