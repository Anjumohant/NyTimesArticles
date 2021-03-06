// Generated by Dagger (https://dagger.dev).
package com.example.nytimesmostArticlearticles.di.module;

import com.example.nytimesmostpopulararticles.data.remote.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideApiServiceFactory(AppModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(module, retrofitProvider.get());
  }

  public static AppModule_ProvideApiServiceFactory create(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideApiServiceFactory(module, retrofitProvider);
  }

  public static ApiService provideApiService(AppModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.provideApiService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
