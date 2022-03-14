package com.example.nytimesmostpopulararticles.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\t8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0012\u0010\u0015\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/example/nytimesmostpopulararticles/presentation/base/BaseActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "V", "Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldagger/android/HasAndroidInjector;", "()V", "bindingVariable", "", "getBindingVariable", "()I", "fragmentDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getFragmentDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setFragmentDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "layoutId", "getLayoutId", "viewModel", "getViewModel", "()Lcom/example/nytimesmostpopulararticles/presentation/base/BaseViewModel;", "androidInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "performDataBinding", "performDependencyInjection", "app_debug"})
public abstract class BaseActivity<T extends androidx.databinding.ViewDataBinding, V extends com.example.nytimesmostpopulararticles.presentation.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity implements dagger.android.HasAndroidInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> fragmentDispatchingAndroidInjector;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getFragmentDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setFragmentDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
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
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void performDependencyInjection() {
    }
    
    private final void performDataBinding() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    public BaseActivity() {
        super();
    }
}