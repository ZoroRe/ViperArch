package me.viper.viperarch.di.component;

import javax.inject.Singleton;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import me.viper.viperarch.ViperApplication;
import me.viper.viperarch.di.module.AppModule;
import me.viper.viperarch.di.module.NetModule;
import me.viper.viperarch.di.module.SubModule;
import me.viper.viperarch.di.builder.ActivityBuilder;

import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AppModule.class, NetModule.class, SubModule.class, ActivityBuilder.class, AndroidSupportInjectionModule.class,AndroidInjectionModule.class})
public interface AppComponent {
  void inject(ViperApplication app);

  AppDataManagerComponent.Builder appDataManagerComponent();
}