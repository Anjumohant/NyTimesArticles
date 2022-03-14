package com.example.nytimesmostpopulararticles.presentation.main.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/main/favorites/FavoritesItemViewModelListener;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseItemListener;", "Lcom/example/nytimesmostpopulararticles/domain/dto/db/Article;", "onRetryClick", "", "app_debug"})
public abstract interface FavoritesItemViewModelListener extends com.example.nytimesmostpopulararticles.presentation.base.BaseItemListener<com.example.nytimesmostpopulararticles.domain.dto.db.Article> {
    
    @java.lang.Override()
    public abstract void onRetryClick();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void onRetryClick(@org.jetbrains.annotations.NotNull()
        com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesItemViewModelListener $this) {
        }
    }
}