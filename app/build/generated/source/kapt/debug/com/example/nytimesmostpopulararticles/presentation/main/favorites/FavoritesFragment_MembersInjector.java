// Generated by Dagger (https://dagger.dev).
package com.example.nytimesmostpopulararticles.presentation.main.favorites;

import com.example.nytimesmostArticlearticles.ViewModelProviderFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavoritesFragment_MembersInjector implements MembersInjector<FavoritesFragment> {
  private final Provider<ViewModelProviderFactory> factoryProvider;

  public FavoritesFragment_MembersInjector(Provider<ViewModelProviderFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<FavoritesFragment> create(
      Provider<ViewModelProviderFactory> factoryProvider) {
    return new FavoritesFragment_MembersInjector(factoryProvider);}

  @Override
  public void injectMembers(FavoritesFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesFragment.factory")
  public static void injectFactory(FavoritesFragment instance, ViewModelProviderFactory factory) {
    instance.factory = factory;
  }
}
