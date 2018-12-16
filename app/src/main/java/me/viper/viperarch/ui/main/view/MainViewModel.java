package me.viper.viperarch.ui.main.view;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import me.viper.viperarch.ui.base.viper.BaseViewModel;
import me.viper.viperarch.ui.main.presenter.MainPresenter;

public class MainViewModel extends BaseViewModel<MainPresenter> {
    //some code use LiveData notify ui change, such as:
    // MutableLiveData<User> users = new MutableLiveData();
}