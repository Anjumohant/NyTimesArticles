package com.example.nytimesmostpopulararticles.presentation.main.favorites

import com.example.nytimesmostpopulararticles.domain.dto.db.Article
import com.example.nytimesmostpopulararticles.presentation.base.BaseItemListener

interface FavoritesItemViewModelListener : BaseItemListener<Article> {
    override fun onRetryClick() {}
}