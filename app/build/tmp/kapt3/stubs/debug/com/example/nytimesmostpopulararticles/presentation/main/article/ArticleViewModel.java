package com.example.nytimesmostpopulararticles.presentation.main.article;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleViewModel;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewModel;", "articleDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleDataSource;", "(Lcom/example/nytimesmostpopulararticles/data/ArticleDataSource;)V", "articlesLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleDataItem;", "articlesLiveDataLiveData", "Landroidx/lifecycle/LiveData;", "getArticlesLiveDataLiveData", "()Landroidx/lifecycle/LiveData;", "fetchArticles", "", "period", "", "mapArticlesDataItem", "articles", "Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse$Article;", "app_debug"})
public final class ArticleViewModel extends com.example.nytimesmostpopulararticles.presentation.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem>> articlesLiveData = null;
    private final com.example.nytimesmostpopulararticles.data.ArticleDataSource articleDataSource = null;
    
    public final void fetchArticles(int period) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem>> getArticlesLiveDataLiveData() {
        return null;
    }
    
    private final void mapArticlesDataItem(java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article> articles) {
    }
    
    public ArticleViewModel(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.ArticleDataSource articleDataSource) {
        super();
    }
}