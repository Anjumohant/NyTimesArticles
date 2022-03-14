package com.example.nytimesmostpopulararticles.presentation.main.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesFragment;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseFragment;", "Lcom/example/nytimesmostpopulararticles/databinding/FragmentFavoritesBinding;", "Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesViewModel;", "Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesItemViewModelListener;", "()V", "bindingVariable", "", "getBindingVariable", "()I", "factory", "Lcom/example/nytimesmostArticlearticles/ViewModelProviderFactory;", "getFactory", "()Lcom/example/nytimesmostArticlearticles/ViewModelProviderFactory;", "setFactory", "(Lcom/example/nytimesmostArticlearticles/ViewModelProviderFactory;)V", "favoritesAdapter", "Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesAdapter;", "layoutId", "getLayoutId", "viewModel", "getViewModel", "()Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "item", "Lcom/example/nytimesmostpopulararticles/domain/dto/db/Article;", "onViewCreated", "view", "Landroid/view/View;", "setUp", "setUpRecyclerView", "app_debug"})
public final class FavoritesFragment extends com.example.nytimesmostpopulararticles.presentation.base.BaseFragment<com.example.nytimesmostpopulararticles.databinding.FragmentFavoritesBinding, com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesViewModel> implements com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesItemViewModelListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.nytimesmostArticlearticles.ViewModelProviderFactory factory;
    private com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesAdapter favoritesAdapter;
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
    public com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.domain.dto.db.Article item) {
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
    
    public FavoritesFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onRetryClick() {
    }
}