package com.example.nytimesmostpopulararticles.presentation.main.article_details;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ArticleDetailsFragmentProvider_ProvideArticleDetailsFragmentFactory
          .ArticleDetailsFragmentSubcomponent.class
)
public abstract class ArticleDetailsFragmentProvider_ProvideArticleDetailsFragmentFactory {
  private ArticleDetailsFragmentProvider_ProvideArticleDetailsFragmentFactory() {}

  @Binds
  @IntoMap
  @ClassKey(ArticleDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ArticleDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ArticleDetailsFragmentSubcomponent
      extends AndroidInjector<ArticleDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ArticleDetailsFragment> {}
  }
}
