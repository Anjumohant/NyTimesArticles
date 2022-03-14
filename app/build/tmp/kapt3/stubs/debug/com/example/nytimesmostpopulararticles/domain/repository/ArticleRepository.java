package com.example.nytimesmostpopulararticles.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/nytimesmostpopulararticles/domain/repository/ArticleRepository;", "Lcom/example/nytimesmostpopulararticles/data/ArticleDataSource;", "apiService", "Lcom/example/nytimesmostpopulararticles/data/remote/ApiService;", "apiKey", "", "(Lcom/example/nytimesmostpopulararticles/data/remote/ApiService;Ljava/lang/String;)V", "getArticles", "Lcom/example/nytimesmostpopulararticles/domain/dto/Result;", "Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse;", "period", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class ArticleRepository implements com.example.nytimesmostpopulararticles.data.ArticleDataSource {
    private final com.example.nytimesmostpopulararticles.data.remote.ApiService apiService = null;
    private final java.lang.String apiKey = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getArticles(int period, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.nytimesmostpopulararticles.domain.dto.Result<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public ArticleRepository(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    @com.example.nytimesmostpopulararticles.di.ApiInfo()
    java.lang.String apiKey) {
        super();
    }
}