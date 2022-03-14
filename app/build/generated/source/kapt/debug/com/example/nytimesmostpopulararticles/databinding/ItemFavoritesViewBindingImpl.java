package com.example.nytimesmostpopulararticles.databinding;
import com.example.nytimesmostpopulararticles.R;
import com.example.nytimesmostpopulararticles.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFavoritesViewBindingImpl extends ItemFavoritesViewBinding implements com.example.nytimesmostpopulararticles.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ic_arrow, 6);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFavoritesViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemFavoritesViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            );
        this.authorTextView.setTag(null);
        this.coverImageView.setTag(null);
        this.dateTextView.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.cardview.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.titleTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.nytimesmostpopulararticles.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.item == variableId) {
            setItem((com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesItemView) variable);
        }
        else if (BR.article == variableId) {
            setArticle((com.example.nytimesmostpopulararticles.domain.dto.db.Article) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesItemView Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setArticle(@Nullable com.example.nytimesmostpopulararticles.domain.dto.db.Article Article) {
        this.mArticle = Article;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.article);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesItemView item = mItem;
        java.lang.String articleTitle = null;
        com.example.nytimesmostpopulararticles.domain.dto.db.Article article = mArticle;
        java.lang.String articleByline = null;
        java.lang.String articlePublishedDate = null;
        java.lang.String articleImageUrl = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (article != null) {
                    // read article.title
                    articleTitle = article.getTitle();
                    // read article.byline
                    articleByline = article.getByline();
                    // read article.publishedDate
                    articlePublishedDate = article.getPublishedDate();
                    // read article.imageUrl
                    articleImageUrl = article.getImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.authorTextView, articleByline);
            com.example.nytimesmostpopulararticles.utils.BindingUtils.setImageUrlCrop(this.coverImageView, articleImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dateTextView, articlePublishedDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, articleTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesItemView item = mItem;
        // item != null
        boolean itemJavaLangObjectNull = false;



        itemJavaLangObjectNull = (item) != (null);
        if (itemJavaLangObjectNull) {


            item.onItemClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): article
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}