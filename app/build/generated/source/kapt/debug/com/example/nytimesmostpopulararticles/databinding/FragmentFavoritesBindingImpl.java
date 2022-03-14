package com.example.nytimesmostpopulararticles.databinding;
import com.example.nytimesmostpopulararticles.R;
import com.example.nytimesmostpopulararticles.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFavoritesBindingImpl extends FragmentFavoritesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFavoritesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentFavoritesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.favoritesRecyclerView.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelArticlesLiveData((androidx.lifecycle.LiveData<java.util.List<com.example.nytimesmostpopulararticles.domain.dto.db.Article>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelArticlesLiveData(androidx.lifecycle.LiveData<java.util.List<com.example.nytimesmostpopulararticles.domain.dto.db.Article>> ViewModelArticlesLiveData, int fieldId) {
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
        androidx.lifecycle.LiveData<java.util.List<com.example.nytimesmostpopulararticles.domain.dto.db.Article>> viewModelArticlesLiveData = null;
        com.example.nytimesmostpopulararticles.presentation.main.favorites.FavoritesViewModel viewModel = mViewModel;
        java.util.List<com.example.nytimesmostpopulararticles.domain.dto.db.Article> viewModelArticlesLiveDataGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.articlesLiveData
                    viewModelArticlesLiveData = viewModel.getArticlesLiveData();
                }
                updateLiveDataRegistration(0, viewModelArticlesLiveData);


                if (viewModelArticlesLiveData != null) {
                    // read viewModel.articlesLiveData.getValue()
                    viewModelArticlesLiveDataGetValue = viewModelArticlesLiveData.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.nytimesmostpopulararticles.utils.BindingUtils.setRecyclerViewData(this.favoritesRecyclerView, viewModelArticlesLiveDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.articlesLiveData
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}