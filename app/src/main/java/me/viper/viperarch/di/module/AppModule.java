package me.viper.viperarch.di.module;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import me.viper.viperarch.data.AppDataManager;
import me.viper.viperarch.data.DataManager;

@Module
public class AppModule{

    @Provides
    @Singleton
    DataManager provideDataManager(){
        return new AppDataManager();
    }
}