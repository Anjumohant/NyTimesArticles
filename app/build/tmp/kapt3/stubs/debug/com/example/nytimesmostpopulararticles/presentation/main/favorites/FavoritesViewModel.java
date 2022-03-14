package com.example.nytimesmostpopulararticles.presentation.main.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesViewModel;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewModel;", "articleFavoritesDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleFavoritesDataSource;", "(Lcom/example/nytimesmostpopulararticles/data/ArticleFavoritesDataSource;)V", "articlesLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/nytimesmostpopulararticles/domain/dto/db/Article;", "getArticlesLiveData", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class FavoritesViewModel extends com.example.nytimesmostpopulararticles.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.nytimesmostpopulararticles.domain.dto.db.Article>> articlesLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.nytimesmostpopulararticles.domain.dto.db.Article>> getArticlesLiveData() {
        return null;
    }
    
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.ArticleFavoritesDataSource articleFavoritesDataSource) {
        super();
    }
}