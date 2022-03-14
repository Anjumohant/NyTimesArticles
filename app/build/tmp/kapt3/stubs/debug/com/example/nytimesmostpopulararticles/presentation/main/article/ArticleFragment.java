package com.example.nytimesmostpopulararticles.presentation.main.article;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016J\u001a\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006,"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleFragment;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseFragment;", "Lcom/example/nytimesmostpopulararticles/databinding/FragmentArticleBinding;", "Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleViewModel;", "Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleAdapterListener;", "()V", "articleAdapter", "Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleAdapter;", "bindingVariable", "", "getBindingVariable", "()I", "factory", "Lcom/example/nytimesmostArticlearticles/ViewModelProviderFactory;", "getFactory", "()Lcom/example/nytimesmostArticlearticles/ViewModelProviderFactory;", "setFactory", "(Lcom/example/nytimesmostArticlearticles/ViewModelProviderFactory;)V", "layoutId", "getLayoutId", "viewModel", "getViewModel", "()Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onItemClick", "item", "Lcom/example/nytimesmostpopulararticles/presentation/main/article/ArticleDataItem;", "onOptionsItemSelected", "", "Landroid/view/MenuItem;", "onRetryClick", "onViewCreated", "view", "Landroid/view/View;", "setUp", "setUpRecyclerView", "app_debug"})
public final class ArticleFragment extends com.example.nytimesmostpopulararticles.presentation.base.BaseFragment<com.example.nytimesmostpopulararticles.databinding.FragmentArticleBinding, com.example.nytimesmostpopulararticles.presentation.main.article.ArticleViewModel> implements com.example.nytimesmostpopulararticles.presentation.main.article.ArticleAdapterListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.nytimesmostArticlearticles.ViewModelProviderFactory factory;
    private com.example.nytimesmostpopulararticles.presentation.main.article.ArticleAdapter articleAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.nytimesmostArticlearticles.ViewModelProviderFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostArticlearticles.ViewModelProviderFactory p0) {
    }
    
    @java.lang.Override()
    public int getBindingVariable() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.nytimesmostpopulararticles.presentation.main.article.ArticleViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onRetryClick() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem item) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUp() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public ArticleFragment() {
        super();
    }
}