package com.example.nytimesmostpopulararticles.presentation.main.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016\u00a8\u0006\u0013"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesAdapter;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseRecyclerViewAdapter;", "Lcom/example/nytimesmostpopulararticles/domain/dto/db/Article;", "items", "", "listener", "Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesItemViewModelListener;", "(Ljava/util/List;Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesItemViewModelListener;)V", "getItemCount", "", "getItemViewType", "position", "onCreateViewHolder", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "EmptyViewHolder", "FavoritesViewHolder", "app_debug"})
public final class FavoritesAdapter extends com.example.nytimesmostpopulararticles.presentation.base.BaseRecyclerViewAdapter<com.example.nytimesmostpopulararticles.domain.dto.db.Article> {
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.nytimesmostpopulararticles.presentation.base.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public FavoritesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.nytimesmostpopulararticles.domain.dto.db.Article> items, @org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesItemViewModelListener listener) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesAdapter$FavoritesViewHolder;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewHolder;", "mBinding", "Lcom/example/nytimesmostpopulararticles/databinding/ItemFavoritesViewBinding;", "(Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesAdapter;Lcom/example/nytimesmostpopulararticles/databinding/ItemFavoritesViewBinding;)V", "onBind", "", "position", "", "app_debug"})
    public final class FavoritesViewHolder extends com.example.nytimesmostpopulararticles.presentation.base.BaseViewHolder {
        private final com.example.nytimesmostpopulararticles.databinding.ItemFavoritesViewBinding mBinding = null;
        
        @java.lang.Override()
        public void onBind(int position) {
        }
        
        public FavoritesViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.nytimesmostpopulararticles.databinding.ItemFavoritesViewBinding mBinding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesAdapter$EmptyViewHolder;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewHolder;", "mBinding", "Lcom/example/nytimesmostpopulararticles/databinding/ItemFavoritesEmptyViewBinding;", "(Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesAdapter;Lcom/example/nytimesmostpopulararticles/databinding/ItemFavoritesEmptyViewBinding;)V", "onBind", "", "position", "", "app_debug"})
    public final class EmptyViewHolder extends com.example.nytimesmostpopulararticles.presentation.base.BaseViewHolder {
        private final com.example.nytimesmostpopulararticles.databinding.ItemFavoritesEmptyViewBinding mBinding = null;
        
        @java.lang.Override()
        public void onBind(int position) {
        }
        
        public EmptyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.nytimesmostpopulararticles.databinding.ItemFavoritesEmptyViewBinding mBinding) {
            super(null);
        }
    }
}