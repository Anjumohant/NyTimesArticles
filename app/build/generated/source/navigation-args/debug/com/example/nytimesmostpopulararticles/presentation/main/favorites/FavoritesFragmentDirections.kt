package com.example.nytimesmostpopulararticles.presentation.main.favorites

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.nytimesmostpopulararticles.R
import com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class FavoritesFragmentDirections private constructor() {
  private data class ToArticleDetailsFragment(
    val article: ArticleDataItem
  ) : NavDirections {
    override fun getActionId(): Int = R.id.to_articleDetailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(ArticleDataItem::class.java)) {
        result.putParcelable("article", this.article as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(ArticleDataItem::class.java)) {
        result.putSerializable("article", this.article as Serializable)
      } else {
        throw UnsupportedOperationException(ArticleDataItem::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun toArticleDetailsFragment(article: ArticleDataItem): NavDirections =
        ToArticleDetailsFragment(article)
  }
}
