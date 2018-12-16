package me.viper.viperarch.ui.main;

import android.os.Bundle;

import me.viper.viperarch.R;
import me.viper.viperarch.data.DataManager;
import me.viper.viperarch.ui.base.DiActivity;
import me.viper.viperarch.ui.base.viper.Assembler;
import me.viper.viperarch.ui.main.interactor.MainInteractor;
import me.viper.viperarch.ui.main.presenter.MainPresenter;
import me.viper.viperarch.ui.main.router.MainRouter;
import me.viper.viperarch.ui.main.view.MainViewModel;

import javax.inject.Inject;

public class MainActivity extends DiActivity{

    @Inject
    MainPresenter presenter;
    @Inject
    MainRouter router;
    @Inject
    MainInteractor interactor;
    @Inject
    MainViewModel viewModel;
    @Inject
    DataManager dataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }


    @Override
    protected Assembler.Builder provideAssemblerBuilder() {
        return new Assembler.Builder()
                .view(viewModel)
                .router(router)
                .presenter(presenter)
                .interactor(interactor)
                .dataManager(dataManager);
    }
}
