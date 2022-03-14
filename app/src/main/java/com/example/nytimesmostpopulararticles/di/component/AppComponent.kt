package com.example.nytimesmostpopulararticles.di.component

import android.app.Application
import com.example.nytimesmostArticlearticles.di.module.AppModule
import com.example.nytimesmostpopulararticles.CustomApplication
import com.example.nytimesmostpopulararticles.di.builder.ActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class])
interface AppComponent {
    fun inject(app: CustomApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}