package me.viper.viperarch.data;

import me.viper.viperarch.data.db.DbService;
import me.viper.viperarch.data.prefs.PreferencesService;
import me.viper.viperarch.data.remote.ApiService;
import me.viper.viperarch.di.scope.DataScope;
import dagger.Module;
import dagger.Provides;

@Module
public class AppDataManagerModule {

    @DataScope
    @Provides
    ApiService provideApiService(){
        return new ApiService();
    }

    @DataScope
    @Provides
    PreferencesService providePreferencesService(){
        return new PreferencesService();
    }

    @DataScope
    @Provides
    DbService provideDbService(){
        return new DbService();
    }
}
