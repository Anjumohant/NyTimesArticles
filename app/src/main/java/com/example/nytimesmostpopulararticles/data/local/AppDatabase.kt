package com.example.nytimesmostpopulararticles.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.nytimesmostpopulararticles.data.local.dao.ArticleDao
import com.example.nytimesmostpopulararticles.domain.dto.db.Article

@Database(
    entities = [Article::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
}