package com.example.nytimesmostArticlearticles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/nytimesmostArticlearticles/ViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "articleDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleDataSource;", "articleDetailsDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleDetailsDataSource;", "articleFavoritesDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleFavoritesDataSource;", "(Lcom/example/nytimesmostpopulararticles/data/ArticleDataSource;Lcom/example/nytimesmostpopulararticles/data/ArticleDetailsDataSource;Lcom/example/nytimesmostpopulararticles/data/ArticleFavoritesDataSource;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
@javax.inject.Singleton()
public final class ViewModelProviderFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
    private final com.example.nytimesmostpopulararticles.data.ArticleDataSource articleDataSource = null;
    private final com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource articleDetailsDataSource = null;
    private final com.example.nytimesmostpopulararticles.data.ArticleFavoritesDataSource articleFavoritesDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    @javax.inject.Inject()
    public ViewModelProviderFactory(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.ArticleDataSource articleDataSource, @org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource articleDetailsDataSource, @org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.ArticleFavoritesDataSource articleFavoritesDataSource) {
        super();
    }
}