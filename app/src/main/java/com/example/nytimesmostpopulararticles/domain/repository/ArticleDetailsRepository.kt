package com.example.nytimesmostpopulararticles.domain.repository

import com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource
import com.example.nytimesmostpopulararticles.data.local.AppDatabase
import com.example.nytimesmostpopulararticles.data.remote.ApiService
import com.example.nytimesmostpopulararticles.di.ApiInfo
import com.example.nytimesmostpopulararticles.domain.dto.Result
import com.example.nytimesmostpopulararticles.domain.dto.db.Article
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ArticleDetailsRepository @Inject constructor(
    private val mAppDatabase: AppDatabase,
    private val apiService: ApiService,
    @param:ApiInfo private val apiKey: String
) : ArticleDetailsDataSource {
    override suspend fun insert(article: Article) = mAppDatabase.articleDao().insert(article)
    override suspend fun delete(article: Article) = mAppDatabase.articleDao().delete(article)
    override suspend fun getFavoriteById(id: Long): Result<Article> {
        return try {
            Result.Success(mAppDatabase.articleDao().getFavoriteById(id))
        } catch (e: Exception) {
            Result.Error(e.localizedMessage)
        }
    }
}