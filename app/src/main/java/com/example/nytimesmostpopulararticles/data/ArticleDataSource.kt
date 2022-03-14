package com.example.nytimesmostpopulararticles.data

import com.example.nytimesmostpopulararticles.domain.dto.Result
import com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse

interface ArticleDataSource {
    suspend fun getArticles(period: Int): Result<ArticlesResponse>
}