package com.example.nytimesmostpopulararticles.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/nytimesmostpopulararticles/domain/repository/ArticleDetailsRepository;", "Lcom/example/nytimesmostpopulararticles/data/ArticleDetailsDataSource;", "mAppDatabase", "Lcom/example/nytimesmostpopulararticles/data/local/AppDatabase;", "apiService", "Lcom/example/nytimesmostpopulararticles/data/remote/ApiService;", "apiKey", "", "(Lcom/example/nytimesmostpopulararticles/data/local/AppDatabase;Lcom/example/nytimesmostpopulararticles/data/remote/ApiService;Ljava/lang/String;)V", "delete", "", "article", "Lcom/example/nytimesmostpopulararticles/domain/dto/db/Article;", "(Lcom/example/nytimesmostpopulararticles/domain/dto/db/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteById", "Lcom/example/nytimesmostpopulararticles/domain/dto/Result;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "app_debug"})
@javax.inject.Singleton()
public final class ArticleDetailsRepository implements com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource {
    private final com.example.nytimesmostpopulararticles.data.local.AppDatabase mAppDatabase = null;
    private final com.example.nytimesmostpopulararticles.data.remote.ApiService apiService = null;
    private final java.lang.String apiKey = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.domain.dto.db.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.domain.dto.db.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavoriteById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.nytimesmostpopulararticles.domain.dto.Result<com.example.nytimesmostpopulararticles.domain.dto.db.Article>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public ArticleDetailsRepository(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.local.AppDatabase mAppDatabase, @org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    @com.example.nytimesmostpopulararticles.di.ApiInfo()
    java.lang.String apiKey) {
        super();
    }
}