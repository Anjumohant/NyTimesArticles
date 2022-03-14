// Generated by Dagger (https://dagger.dev).
package com.example.nytimesmostArticlearticles.di.module;

import com.example.nytimesmostpopulararticles.data.ArticleDetailsDataSource;
import com.example.nytimesmostpopulararticles.domain.repository.ArticleDetailsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideArticleDetailsDataSourceFactory implements Factory<ArticleDetailsDataSource> {
  private final AppModule module;

  private final Provider<ArticleDetailsRepository> articleDetailsRepositoryProvider;

  public AppModule_ProvideArticleDetailsDataSourceFactory(AppModule module,
      Provider<ArticleDetailsRepository> articleDetailsRepositoryProvider) {
    this.module = module;
    this.articleDetailsRepositoryProvider = articleDetailsRepositoryProvider;
  }

  @Override
  public ArticleDetailsDataSource get() {
    return provideArticleDetailsDataSource(module, articleDetailsRepositoryProvider.get());
  }

  public static AppModule_ProvideArticleDetailsDataSourceFactory create(AppModule module,
      Provider<ArticleDetailsRepository> articleDetailsRepositoryProvider) {
    return new AppModule_ProvideArticleDetailsDataSourceFactory(module, articleDetailsRepositoryProvider);
  }

  public static ArticleDetailsDataSource provideArticleDetailsDataSource(AppModule instance,
      ArticleDetailsRepository ArticleDetailsRepository) {
    return Preconditions.checkNotNull(instance.provideArticleDetailsDataSource(ArticleDetailsRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}