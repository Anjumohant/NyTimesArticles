package com.example.nytimesmostpopulararticles.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/base/BaseRecyclerViewAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewHolder;", "items", "", "itemListener", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseItemListener;", "(Ljava/util/List;Lcom/example/nytimesmostpopulararticles/presentation/base/BaseItemListener;)V", "getItemListener", "()Lcom/example/nytimesmostpopulararticles/presentation/base/BaseItemListener;", "getItems", "()Ljava/util/List;", "addItems", "", "", "clearItems", "onBindViewHolder", "holder", "position", "", "app_debug"})
public abstract class BaseRecyclerViewAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.nytimesmostpopulararticles.presentation.base.BaseViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> items = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.nytimesmostpopulararticles.presentation.base.BaseItemListener<T> itemListener = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.presentation.base.BaseViewHolder holder, int position) {
    }
    
    public final void addItems(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items) {
    }
    
    public final void clearItems() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.nytimesmostpopulararticles.presentation.base.BaseItemListener<T> getItemListener() {
        return null;
    }
    
    public BaseRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<T> items, @org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.presentation.base.BaseItemListener<T> itemListener) {
        super();
    }
}