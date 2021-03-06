// Generated by Dagger (https://dagger.dev).
package com.example.nytimesmostArticlearticles;

import com.example.nytimesmostpopulararticles.data.ArticleDataSource;
import com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource;
import com.example.nytimesmostpopulararticles.data.ArticleFavoritesDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModelProviderFactory_Factory implements Factory<ViewModelProviderFactory> {
  private final Provider<ArticleDataSource> articleDataSourceProvider;

  private final Provider<ArticleDetailsDataSource> articleDetailsDataSourceProvider;

  private final Provider<ArticleFavoritesDataSource> articleFavoritesDataSourceProvider;

  public ViewModelProviderFactory_Factory(Provider<ArticleDataSource> articleDataSourceProvider,
      Provider<ArticleDetailsDataSource> articleDetailsDataSourceProvider,
      Provider<ArticleFavoritesDataSource> articleFavoritesDataSourceProvider) {
    this.articleDataSourceProvider = articleDataSourceProvider;
    this.articleDetailsDataSourceProvider = articleDetailsDataSourceProvider;
    this.articleFavoritesDataSourceProvider = articleFavoritesDataSourceProvider;
  }

  @Override
  public ViewModelProviderFactory get() {
    return newInstance(articleDataSourceProvider.get(), articleDetailsDataSourceProvider.get(), articleFavoritesDataSourceProvider.get());
  }

  public static ViewModelProviderFactory_Factory create(
      Provider<ArticleDataSource> articleDataSourceProvider,
      Provider<ArticleDetailsDataSource> articleDetailsDataSourceProvider,
      Provider<ArticleFavoritesDataSource> articleFavoritesDataSourceProvider) {
    return new ViewModelProviderFactory_Factory(articleDataSourceProvider, articleDetailsDataSourceProvider, articleFavoritesDataSourceProvider);
  }

  public static ViewModelProviderFactory newInstance(ArticleDataSource articleDataSource,
      ArticleDetailsDataSource articleDetailsDataSource,
      ArticleFavoritesDataSource articleFavoritesDataSource) {
    return new ViewModelProviderFactory(articleDataSource, articleDetailsDataSource, articleFavoritesDataSource);
  }
}
