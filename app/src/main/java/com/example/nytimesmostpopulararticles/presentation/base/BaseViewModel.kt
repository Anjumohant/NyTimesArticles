package com.example.nytimesmostpopulararticles.presentation.base

import androidx.lifecycle.ViewModel
import com.example.nytimesmostpopulararticles.utils.SingleLiveEvent

abstract class BaseViewModel : ViewModel() {
    val isLoading: SingleLiveEvent<Boolean> = SingleLiveEvent()
    val showToast: SingleLiveEvent<String> = SingleLiveEvent()
}