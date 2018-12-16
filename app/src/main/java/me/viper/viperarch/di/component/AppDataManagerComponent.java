package me.viper.viperarch.di.component;


import me.viper.viperarch.data.AppDataManager;
import me.viper.viperarch.data.AppDataManagerModule;
import me.viper.viperarch.di.scope.DataScope;

import dagger.Subcomponent;

@DataScope
@Subcomponent(modules = AppDataManagerModule.class)
public interface AppDataManagerComponent {
    void inject(AppDataManager dataManager);
    @Subcomponent.Builder
    interface Builder{
        AppDataManagerComponent build();
    }
}
