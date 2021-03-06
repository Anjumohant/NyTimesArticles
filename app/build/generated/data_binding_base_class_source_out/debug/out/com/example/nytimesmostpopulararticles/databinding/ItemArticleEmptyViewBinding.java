// Generated by data binding compiler. Do not edit!
package com.example.nytimesmostpopulararticles.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.nytimesmostpopulararticles.R;
import com.example.nytimesmostpopulararticles.presentation.main.article.ArticleEmptyItemView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemArticleEmptyViewBinding extends ViewDataBinding {
  @NonNull
  public final Button btnRetry;

  @NonNull
  public final ImageView imageViewEmpty;

  @NonNull
  public final LinearLayout linearLayoutView;

  @Bindable
  protected ArticleEmptyItemView mItem;

  protected ItemArticleEmptyViewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnRetry, ImageView imageViewEmpty, LinearLayout linearLayoutView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRetry = btnRetry;
    this.imageViewEmpty = imageViewEmpty;
    this.linearLayoutView = linearLayoutView;
  }

  public abstract void setItem(@Nullable ArticleEmptyItemView item);

  @Nullable
  public ArticleEmptyItemView getItem() {
    return mItem;
  }

  @NonNull
  public static ItemArticleEmptyViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_article_empty_view, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemArticleEmptyViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemArticleEmptyViewBinding>inflateInternal(inflater, R.layout.item_article_empty_view, root, attachToRoot, component);
  }

  @NonNull
  public static ItemArticleEmptyViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_article_empty_view, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemArticleEmptyViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemArticleEmptyViewBinding>inflateInternal(inflater, R.layout.item_article_empty_view, null, false, component);
  }

  public static ItemArticleEmptyViewBinding bind(@NonNull View view) {
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
  public static ItemArticleEmptyViewBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemArticleEmptyViewBinding)bind(component, view, R.layout.item_article_empty_view);
  }
}
