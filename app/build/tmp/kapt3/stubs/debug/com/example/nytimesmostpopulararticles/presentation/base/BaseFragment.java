package com.example.nytimesmostpopulararticles.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0012\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\u001a\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010$\u001a\u00020\u0015H\u0002R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0010\u0010\r\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u000f\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/base/BaseFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "V", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "bindingVariable", "", "getBindingVariable", "()I", "layoutId", "getLayoutId", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewModel;", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "navigate", "", "command", "Lcom/example/nytimesmostpopulararticles/presentation/base/NavigationCommand;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "performDependencyInjection", "app_debug"})
public abstract class BaseFragment<T extends androidx.databinding.ViewDataBinding, V extends com.example.nytimesmostpopulararticles.presentation.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    private T viewDataBinding;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * Override for set binding variable
     *
     * @return variable id
     */
    public abstract int getBindingVariable();
    
    /**
     * @return layout resource id
     */
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    /**
     * Override for set view dto
     *
     * @return view dto instance
     */
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewModel();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewDataBinding() {
        return null;
    }
    
    public final void navigate(@org.jetbrains.annotations.NotNull()
    com.example.nytimesmostpopulararticles.presentation.base.NavigationCommand command) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void performDependencyInjection() {
    }
    
    public BaseFragment() {
        super();
    }
}