package com.example.nytimesmostArticlearticles.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\bH\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/example/nytimesmostArticlearticles/di/module/AppModule;", "", "()V", "provideApiKey", "", "provideApiService", "Lcom/example/nytimesmostpopulararticles/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideAppDatabase", "Lcom/example/nytimesmostpopulararticles/data/local/AppDatabase;", "context", "Landroid/content/Context;", "provideArticleDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleDataSource;", "ArticleRepository", "Lcom/example/nytimesmostpopulararticles/domain/repository/ArticleRepository;", "provideArticleDetailsDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleDetailsDataSource;", "ArticleDetailsRepository", "Lcom/example/nytimesmostpopulararticles/domain/repository/ArticleDetailsRepository;", "provideArticleFavoritesDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleFavoritesDataSource;", "ArticleFavoritesRepository", "Lcom/example/nytimesmostpopulararticles/domain/repository/ArticleFavoritesRepository;", "provideContext", "application", "Landroid/app/Application;", "provideRetrofit", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.nytimesmostpopulararticles.di.ApiInfo()
    @dagger.Provides()
    public final java.lang.String provideApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.nytimesmostpopulararticles.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.nytimesmostpopulararticles.data.local.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.nytimesmostpopulararticles.data.ArticleDataSource provideArticleDataSource(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.domain.repository.ArticleRepository ArticleRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource provideArticleDetailsDataSource(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.domain.repository.ArticleDetailsRepository ArticleDetailsRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.nytimesmostpopulararticles.data.ArticleFavoritesDataSource provideArticleFavoritesDataSource(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.domain.repository.ArticleFavoritesRepository ArticleFavoritesRepository) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}