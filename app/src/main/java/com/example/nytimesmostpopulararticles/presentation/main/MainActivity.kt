package com.example.nytimesmostpopulararticles.presentation.main

import androidx.lifecycle.ViewModelProvider
import com.example.nytimesmostArticlearticles.ViewModelProviderFactory
import com.example.nytimesmostpopulararticles.BR
import com.example.nytimesmostpopulararticles.R
import com.example.nytimesmostpopulararticles.databinding.ActivityMainBinding
import com.example.nytimesmostpopulararticles.presentation.base.BaseActivity
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(),
    HasAndroidInjector {
    @Inject
    lateinit var factory: ViewModelProviderFactory

    override val bindingVariable: Int
        get() = BR.viewModel

    override val layoutId: Int
        get() = R.layout.activity_main

    override val viewModel: MainViewModel
        get() = ViewModelProvider(this, factory).get(MainViewModel::class.java)
}