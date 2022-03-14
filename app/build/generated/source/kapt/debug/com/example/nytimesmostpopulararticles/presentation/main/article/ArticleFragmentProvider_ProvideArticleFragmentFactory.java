package com.example.nytimesmostpopulararticles.presentation.main.article;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ArticleFragmentProvider_ProvideArticleFragmentFactory.ArticleFragmentSubcomponent.class
)
public abstract class ArticleFragmentProvider_ProvideArticleFragmentFactory {
  private ArticleFragmentProvider_ProvideArticleFragmentFactory() {}

  @Binds
  @IntoMap
  @ClassKey(ArticleFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ArticleFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ArticleFragmentSubcomponent extends AndroidInjector<ArticleFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ArticleFragment> {}
  }
}
