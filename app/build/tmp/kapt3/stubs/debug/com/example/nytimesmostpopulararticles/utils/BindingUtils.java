package com.example.nytimesmostpopulararticles.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J&\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/nytimesmostpopulararticles/utils/BindingUtils;", "", "()V", "setImageUrl", "", "imageView", "Landroid/widget/ImageView;", "url", "", "setImageUrlCrop", "setRecyclerViewData", "T", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "items", "", "app_debug"})
public final class BindingUtils {
    public static final com.example.nytimesmostpopulararticles.utils.BindingUtils INSTANCE = null;
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @androidx.databinding.BindingAdapter(value = {"adapter"})
    public static final <T extends java.lang.Object>void setRecyclerViewData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrlCrop"})
    public static final void setImageUrlCrop(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    private BindingUtils() {
        super();
    }
}