package com.example.nytimesmostpopulararticles.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/nytimesmostpopulararticles/domain/repository/ArticleFavoritesRepository;", "Lcom/example/nytimesmostpopulararticles/data/ArticleFavoritesDataSource;", "mAppDatabase", "Lcom/example/nytimesmostpopulararticles/data/local/AppDatabase;", "(Lcom/example/nytimesmostpopulararticles/data/local/AppDatabase;)V", "getAllFavorites", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/nytimesmostpopulararticles/domain/dto/db/Article;", "app_debug"})
@javax.inject.Singleton()
public final class ArticleFavoritesRepository implements com.example.nytimesmostpopulararticles.data.ArticleFavoritesDataSource {
    private final com.example.nytimesmostpopulararticles.data.local.AppDatabase mAppDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.nytimesmostpopulararticles.domain.dto.db.Article>> getAllFavorites() {
        return null;
    }
    
    @javax.inject.Inject()
    public ArticleFavoritesRepository(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.local.AppDatabase mAppDatabase) {
        super();
    }
}