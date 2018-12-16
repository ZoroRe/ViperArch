package me.viper.viperarch.data;

import javax.inject.Inject;

import me.viper.viperarch.data.db.DbService;
import me.viper.viperarch.data.prefs.PreferencesService;
import me.viper.viperarch.data.remote.ApiService;

public class AppDataManager implements DataManager {

    @Inject
    ApiService apiService;
    @Inject
    DbService dbService;
    @Inject
    PreferencesService preferencesService;

    public AppDataManager() {

    }
}
