package com.example.nytimesmostpopulararticles.presentation.main.favorites

class FavoritesItemView(private val action: () -> Unit) {
    fun onItemClick() = action.invoke()
}