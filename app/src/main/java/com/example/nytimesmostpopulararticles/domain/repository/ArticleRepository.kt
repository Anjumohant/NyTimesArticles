package com.example.nytimesmostpopulararticles.domain.repository

import com.example.nytimesmostpopulararticles.data.ArticleDataSource
import com.example.nytimesmostpopulararticles.data.remote.ApiService
import com.example.nytimesmostpopulararticles.di.ApiInfo
import com.example.nytimesmostpopulararticles.domain.dto.Result
import com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ArticleRepository @Inject constructor(
    private val apiService: ApiService,
    @param:ApiInfo private val apiKey: String
) : ArticleDataSource {
    override suspend fun getArticles(period: Int): Result<ArticlesResponse> {
        return try {
            val articlesResponse = apiService.getArticles(period, apiKey)
            Result.Success(articlesResponse)
        } catch (e: Exception) {
            Result.Error(e.localizedMessage)
        }
    }
}