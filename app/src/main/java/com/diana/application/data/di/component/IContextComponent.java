package com.diana.application.data.di.component;

import com.diana.application.MainActivity;
import com.diana.application.data.di.module.Context;
import com.diana.application.data.di.module.ContextModule;
import com.diana.application.ui.ProductListFragment;

import dagger.Subcomponent;

/**
 * Created by Diana on 26.06.2019.
 */

@Subcomponent(modules = ContextModule.class)
@Context
public interface IContextComponent {

    void inject(MainActivity mainActivity);
    void inject(ProductListFragment productListFragment);
    void inject(CategoryListFragment fragment);
    void inject(ProductDetailActivity mainActivity);

}
