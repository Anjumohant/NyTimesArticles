package com.example.nytimesmostpopulararticles.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&\u00a8\u0006\b"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/base/BaseItemListener;", "T", "", "onItemClick", "", "item", "(Ljava/lang/Object;)V", "onRetryClick", "app_debug"})
public abstract interface BaseItemListener<T extends java.lang.Object> {
    
    public abstract void onItemClick(T item);
    
    public abstract void onRetryClick();
}