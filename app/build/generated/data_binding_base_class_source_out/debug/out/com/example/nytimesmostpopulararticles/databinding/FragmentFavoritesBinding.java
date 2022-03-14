// Generated by data binding compiler. Do not edit!
package com.example.nytimesmostpopulararticles.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.nytimesmostpopulararticles.R;
import com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFavoritesBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView favoritesRecyclerView;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected FavoritesViewModel mViewModel;

  protected FragmentFavoritesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView favoritesRecyclerView, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.favoritesRecyclerView = favoritesRecyclerView;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable FavoritesViewModel viewModel);

  @Nullable
  public FavoritesViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentFavoritesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_favorites, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFavoritesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFavoritesBinding>inflateInternal(inflater, R.layout.fragment_favorites, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFavoritesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_favorites, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFavoritesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFavoritesBinding>inflateInternal(inflater, R.layout.fragment_favorites, null, false, component);
  }

  public static FragmentFavoritesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentFavoritesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFavoritesBinding)bind(component, view, R.layout.fragment_favorites);
  }
}
