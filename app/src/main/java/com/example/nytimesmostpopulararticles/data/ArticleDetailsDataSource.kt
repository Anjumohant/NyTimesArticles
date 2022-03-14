package com.example.nytimesmostpopulararticles.data

import com.example.nytimesmostpopulararticles.domain.dto.Result
import com.example.nytimesmostpopulararticles.domain.dto.db.Article

interface ArticleDetailsDataSource {
    suspend fun insert(article: Article)
    suspend fun delete(article: Article)
    suspend fun getFavoriteById(id: Long): Result<Article>
}