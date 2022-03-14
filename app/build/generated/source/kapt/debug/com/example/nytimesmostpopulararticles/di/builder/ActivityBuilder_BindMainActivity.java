package com.example.nytimesmostpopulararticles.di.builder;

import com.example.nytimesmostpopulararticles.presentation.main.MainActivity;
import com.example.nytimesmostpopulararticles.presentation.main.article.ArticleFragmentProvider;
import com.example.nytimesmostpopulararticles.presentation.main.article_details.ArticleDetailsFragmentProvider;
import com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesFragmentProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindMainActivity.MainActivitySubcomponent.class)
public abstract class ActivityBuilder_BindMainActivity {
  private ActivityBuilder_BindMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {
      ArticleFragmentProvider.class,
      ArticleDetailsFragmentProvider.class,
      FavoritesFragmentProvider.class
    }
  )
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
