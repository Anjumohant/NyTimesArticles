package com.example.nytimesmostpopulararticles.data

import androidx.lifecycle.LiveData
import com.example.nytimesmostpopulararticles.domain.dto.db.Article

interface ArticleFavoritesDataSource {
    fun getAllFavorites(): LiveData<List<Article>>
}