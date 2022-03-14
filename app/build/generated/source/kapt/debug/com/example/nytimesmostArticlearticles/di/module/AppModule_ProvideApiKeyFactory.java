// Generated by Dagger (https://dagger.dev).
package com.example.nytimesmostArticlearticles.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApiKeyFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_ProvideApiKeyFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideApiKey(module);
  }

  public static AppModule_ProvideApiKeyFactory create(AppModule module) {
    return new AppModule_ProvideApiKeyFactory(module);
  }

  public static String provideApiKey(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideApiKey(), "Cannot return null from a non-@Nullable @Provides method");
  }
}