package com.example.nytimesmostpopulararticles.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "isLoading", "Lcom/example/nytimesmostpopulararticles/utils/SingleLiveEvent;", "", "()Lcom/example/nytimesmostpopulararticles/utils/SingleLiveEvent;", "showToast", "", "getShowToast", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.nytimesmostpopulararticles.utils.SingleLiveEvent<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.nytimesmostpopulararticles.utils.SingleLiveEvent<java.lang.String> showToast = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.nytimesmostpopulararticles.utils.SingleLiveEvent<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.nytimesmostpopulararticles.utils.SingleLiveEvent<java.lang.String> getShowToast() {
        return null;
    }
    
    public BaseViewModel() {
        super();
    }
}