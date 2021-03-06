package me.viper.viperarch.ui.base.viper;

import android.support.annotation.NonNull;

import me.viper.viperarch.data.DataManager;

public abstract class BaseInteractor<P extends IBasePresenter, D extends DataManager> implements IBaseInteractor{
    private D dataManager;
    private P presenter;

    public void attachDataManager(@NonNull D dataManager) {
        this.dataManager = dataManager;
    }

    public D getDataManager() {
        return dataManager;
    }

    public void detachDataManager() {
        this.dataManager = null;
    }

    public boolean isDataManagerAttached() {
        return dataManager != null;
    }

    public void attachPresenter(@NonNull P presenter) {
        this.presenter = presenter;
    }

    public void detachPresenter() {
        this.presenter = null;
    }

    public boolean isPresenterAttached() {
        return this.presenter != null;
    }

    public P getPresenter() {
        return presenter;
    }


}
