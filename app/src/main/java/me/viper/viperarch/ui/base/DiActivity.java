package me.viper.viperarch.ui.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import me.viper.viperarch.ui.base.viper.Assembler;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public abstract class DiActivity extends BaseActivity implements HasSupportFragmentInjector {

    private Assembler assembler;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    protected void onCreate(Bundle savedInstanceState) {
        performInjection();
        super.onCreate(savedInstanceState);
        Assembler.Builder assemblerBuilder = provideAssemblerBuilder();
        if (assemblerBuilder != null) {
            assembler = assemblerBuilder.build();
        }

        if (assembler != null) {
            assembler.bind();
        }
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }

    private void performInjection() {
        AndroidInjection.inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (assembler != null) {
            assembler.unbind();
        }
    }

    protected abstract Assembler.Builder provideAssemblerBuilder();

}
