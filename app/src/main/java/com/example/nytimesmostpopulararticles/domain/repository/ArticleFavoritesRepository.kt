package com.example.nytimesmostpopulararticles.domain.repository

import androidx.lifecycle.LiveData
import com.example.nytimesmostpopulararticles.data.ArticleFavoritesDataSource
import com.example.nytimesmostpopulararticles.data.local.AppDatabase
import com.example.nytimesmostpopulararticles.domain.dto.db.Article
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ArticleFavoritesRepository @Inject constructor(
    private val mAppDatabase: AppDatabase
) : ArticleFavoritesDataSource {
    override fun getAllFavorites(): LiveData<List<Article>> = mAppDatabase.articleDao().getAllFavorites()
}