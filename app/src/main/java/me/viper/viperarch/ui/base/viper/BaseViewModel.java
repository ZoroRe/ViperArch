package me.viper.viperarch.ui.base.viper;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

public abstract class BaseViewModel<P extends IBasePresenter> extends ViewModel implements IBaseView{


    private P presenter;

    public void attachPresenter(@NonNull P presenter) {
        this.presenter = presenter;
    }

    public void detachPresenter() {
        this.presenter = null;
    }

    public P getPresenter() {
        return this.presenter;
    }

    public boolean isPresenterAttached() {
        return presenter != null;
    }


}
