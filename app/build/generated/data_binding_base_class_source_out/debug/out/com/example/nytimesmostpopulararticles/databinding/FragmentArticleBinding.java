// Generated by data binding compiler. Do not edit!
package com.example.nytimesmostpopulararticles.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.nytimesmostpopulararticles.R;
import com.example.nytimesmostpopulararticles.presentation.main.article.ArticleViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentArticleBinding extends ViewDataBinding {
  @NonNull
  public final ContentLoadingProgressBar addressLookingUp;

  @NonNull
  public final RecyclerView resultsBeanRecyclerView;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected ArticleViewModel mViewModel;

  protected FragmentArticleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ContentLoadingProgressBar addressLookingUp, RecyclerView resultsBeanRecyclerView,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addressLookingUp = addressLookingUp;
    this.resultsBeanRecyclerView = resultsBeanRecyclerView;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable ArticleViewModel viewModel);

  @Nullable
  public ArticleViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_article, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentArticleBinding>inflateInternal(inflater, R.layout.fragment_article, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_article, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentArticleBinding>inflateInternal(inflater, R.layout.fragment_article, null, false, component);
  }

  public static FragmentArticleBinding bind(@NonNull View view) {
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
  public static FragmentArticleBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentArticleBinding)bind(component, view, R.layout.fragment_article);
  }
}
