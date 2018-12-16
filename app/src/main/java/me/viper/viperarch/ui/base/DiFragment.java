package me.viper.viperarch.ui.base;


import android.content.Context;
import android.support.v4.app.Fragment;

import me.viper.viperarch.ui.base.viper.Assembler;

import dagger.android.support.AndroidSupportInjection;

public abstract class DiFragment extends Fragment {

    Assembler assembler;

    @Override
    public void onAttach(Context context) {
        performInjection();
        super.onAttach(context);
        Assembler.Builder assBuilder = provideAssemblerBuilder();
        if (assBuilder != null) {
            assembler = assBuilder.build();
            assembler.bind();
        }
    }

    private void performInjection() {
        AndroidSupportInjection.inject(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (assembler != null) {
            assembler.unbind();
        }
    }

    protected abstract Assembler.Builder provideAssemblerBuilder();


}
