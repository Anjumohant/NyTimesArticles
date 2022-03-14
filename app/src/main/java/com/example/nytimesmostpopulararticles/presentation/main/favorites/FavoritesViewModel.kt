package com.example.nytimesmostpopulararticles.presentation.main.favorites

import androidx.lifecycle.LiveData
import com.example.nytimesmostpopulararticles.data.ArticleFavoritesDataSource
import com.example.nytimesmostpopulararticles.domain.dto.db.Article
import com.example.nytimesmostpopulararticles.presentation.base.BaseViewModel

class FavoritesViewModel(
    articleFavoritesDataSource: ArticleFavoritesDataSource
) : BaseViewModel() {
    val articlesLiveData: LiveData<List<Article>> = articleFavoritesDataSource.getAllFavorites()
}