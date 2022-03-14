package com.example.nytimesmostpopulararticles.presentation.main.favorites;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FavoritesFragmentProvider_ProvideFavoritesFragmentFactory.FavoritesFragmentSubcomponent.class
)
public abstract class FavoritesFragmentProvider_ProvideFavoritesFragmentFactory {
  private FavoritesFragmentProvider_ProvideFavoritesFragmentFactory() {}

  @Binds
  @IntoMap
  @ClassKey(FavoritesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FavoritesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FavoritesFragmentSubcomponent extends AndroidInjector<FavoritesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FavoritesFragment> {}
  }
}
