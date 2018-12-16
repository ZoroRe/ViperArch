package me.viper.viperarch;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import me.viper.viperarch.di.component.AppComponent;
import me.viper.viperarch.di.component.DaggerAppComponent;


/**
 * Created by luguanquan
 * Created on 2018/12/13
 * Email : guanquan.lu@gmail.com
 */
public class ViperApplication extends Application implements HasActivityInjector {

    AppComponent appComponent;

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
        appComponent.inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
