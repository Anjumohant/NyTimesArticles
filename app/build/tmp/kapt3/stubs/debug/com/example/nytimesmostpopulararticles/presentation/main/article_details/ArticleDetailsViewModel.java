package com.example.nytimesmostpopulararticles.presentation.main.article_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/article_details/ArticleDetailsViewModel;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewModel;", "articleDetailsDataSource", "Lcom/example/nytimesmostpopulararticles/data/ArticleDetailsDataSource;", "(Lcom/example/nytimesmostpopulararticles/data/ArticleDetailsDataSource;)V", "isFavorite", "Landroidx/lifecycle/MutableLiveData;", "", "deleteArticle", "", "articleDataItem", "Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleDataItem;", "getFavoriteById", "id", "", "getIsFavorite", "Landroidx/lifecycle/LiveData;", "insertArticle", "onFavClick", "app_debug"})
public final class ArticleDetailsViewModel extends com.example.nytimesmostpopulararticles.presentation.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFavorite = null;
    private final com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource articleDetailsDataSource = null;
    
    private final void insertArticle(com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem articleDataItem) {
    }
    
    private final void deleteArticle(com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem articleDataItem) {
    }
    
    public final void getFavoriteById(long id) {
    }
    
    public final void onFavClick(boolean isFavorite, @org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem articleDataItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getIsFavorite() {
        return null;
    }
    
    public ArticleDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource articleDetailsDataSource) {
        super();
    }
}