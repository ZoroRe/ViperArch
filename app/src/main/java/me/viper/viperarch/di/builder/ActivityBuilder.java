package me.viper.viperarch.di.builder;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.viper.viperarch.di.scope.ActivityScope;
import me.viper.viperarch.ui.main.MainActivity;
import me.viper.viperarch.ui.main.MainActivityModule;


@Module
public abstract class ActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}