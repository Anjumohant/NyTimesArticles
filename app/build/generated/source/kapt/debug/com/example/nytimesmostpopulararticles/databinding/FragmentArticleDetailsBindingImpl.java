package com.example.nytimesmostpopulararticles.databinding;
import com.example.nytimesmostpopulararticles.R;
import com.example.nytimesmostpopulararticles.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentArticleDetailsBindingImpl extends FragmentArticleDetailsBinding implements com.example.nytimesmostpopulararticles.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 8);
        sViewsWithIds.put(R.id.toolbar, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentArticleDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentArticleDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (android.widget.ScrollView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[9]
            , (android.widget.TextView) bindings[7]
            );
        this.authorTextView.setTag(null);
        this.contentTextView.setTag(null);
        this.coverImageView.setTag(null);
        this.dateTextView.setTag(null);
        this.fab.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleTextView.setTag(null);
        this.urlTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.nytimesmostpopulararticles.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.article == variableId) {
            setArticle((com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.nytimesmostpopulararticles.presentation.main.article_details.ArticleDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArticle(@Nullable com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem Article) {
        this.mArticle = Article;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.article);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.nytimesmostpopulararticles.presentation.main.article_details.ArticleDetailsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsFavorite((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsFavorite(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsFavorite, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.graphics.drawable.Drawable viewModelIsFavoriteFabAndroidDrawableIcFavoriteFabAndroidDrawableIcUnfavorite = null;
        java.lang.String articleTitle = null;
        java.lang.Boolean viewModelIsFavoriteGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsFavoriteGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsFavorite = null;
        com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem article = mArticle;
        java.lang.String articleByline = null;
        java.lang.String articleUrl = null;
        java.lang.String articlePublishedDate = null;
        com.example.nytimesmostpopulararticles.presentation.main.article_details.ArticleDetailsViewModel viewModel = mViewModel;
        java.lang.String articleImageUrl = null;
        java.lang.String articleAbstractX = null;

        if ((dirtyFlags & 0xaL) != 0) {



                if (article != null) {
                    // read article.title
                    articleTitle = article.getTitle();
                    // read article.byline
                    articleByline = article.getByline();
                    // read article.url
                    articleUrl = article.getUrl();
                    // read article.publishedDate
                    articlePublishedDate = article.getPublishedDate();
                    // read article.imageUrl
                    articleImageUrl = article.getImageUrl();
                    // read article.abstractX
                    articleAbstractX = article.getAbstractX();
                }
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.isFavorite
                    viewModelIsFavorite = viewModel.getIsFavorite();
                }
                updateLiveDataRegistration(0, viewModelIsFavorite);


                if (viewModelIsFavorite != null) {
                    // read viewModel.isFavorite.getValue()
                    viewModelIsFavoriteGetValue = viewModelIsFavorite.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isFavorite.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsFavoriteGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsFavoriteGetValue);
            if((dirtyFlags & 0xdL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsFavoriteGetValue) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isFavorite.getValue()) ? @android:drawable/ic_favorite : @android:drawable/ic_unfavorite
                viewModelIsFavoriteFabAndroidDrawableIcFavoriteFabAndroidDrawableIcUnfavorite = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsFavoriteGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(fab.getContext(), R.drawable.ic_favorite)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(fab.getContext(), R.drawable.ic_unfavorite)));
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.authorTextView, articleByline);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.contentTextView, articleAbstractX);
            com.example.nytimesmostpopulararticles.utils.BindingUtils.setImageUrl(this.coverImageView, articleImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dateTextView, articlePublishedDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, articleTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.urlTextView, articleUrl);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fab.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.fab, viewModelIsFavoriteFabAndroidDrawableIcFavoriteFabAndroidDrawableIcUnfavorite);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // article
        com.example.nytimesmostpopulararticles.presentation.main.article.ArticleDataItem article = mArticle;
        // viewModel.isFavorite
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsFavorite = null;
        // viewModel.isFavorite != null
        boolean viewModelIsFavoriteJavaLangObjectNull = false;
        // viewModel.isFavorite.getValue()
        java.lang.Boolean viewModelIsFavoriteGetValue = null;
        // viewModel
        com.example.nytimesmostpopulararticles.presentation.main.article_details.ArticleDetailsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModelIsFavorite = viewModel.getIsFavorite();

            viewModelIsFavoriteJavaLangObjectNull = (viewModelIsFavorite) != (null);
            if (viewModelIsFavoriteJavaLangObjectNull) {


                viewModelIsFavoriteGetValue = viewModelIsFavorite.getValue();


                viewModel.onFavClick(viewModelIsFavoriteGetValue, article);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isFavorite
        flag 1 (0x2L): article
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isFavorite.getValue()) ? @android:drawable/ic_favorite : @android:drawable/ic_unfavorite
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isFavorite.getValue()) ? @android:drawable/ic_favorite : @android:drawable/ic_unfavorite
    flag mapping end*/
    //end
}