// Generated by Dagger (https://dagger.dev).
package com.example.nytimesmostArticlearticles.di.module;

import com.example.nytimesmostpopulararticles.data.ArticleDataSource;
import com.example.nytimesmostpopulararticles.domain.repository.ArticleRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideArticleDataSourceFactory implements Factory<ArticleDataSource> {
  private final AppModule module;

  private final Provider<ArticleRepository> articleRepositoryProvider;

  public AppModule_ProvideArticleDataSourceFactory(AppModule module,
      Provider<ArticleRepository> articleRepositoryProvider) {
    this.module = module;
    this.articleRepositoryProvider = articleRepositoryProvider;
  }

  @Override
  public ArticleDataSource get() {
    return provideArticleDataSource(module, articleRepositoryProvider.get());
  }

  public static AppModule_ProvideArticleDataSourceFactory create(AppModule module,
      Provider<ArticleRepository> articleRepositoryProvider) {
    return new AppModule_ProvideArticleDataSourceFactory(module, articleRepositoryProvider);
  }

  public static ArticleDataSource provideArticleDataSource(AppModule instance,
      ArticleRepository ArticleRepository) {
    return Preconditions.checkNotNull(instance.provideArticleDataSource(ArticleRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
