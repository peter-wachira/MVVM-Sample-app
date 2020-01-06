package com.androidtutz.anushka.lifecycledemo;

import androidx.lifecycle.ViewModel;



public class MainActivityVIewModel extends ViewModel {

    private int clickCount=0;

    public  int getCurrentCount(){

        clickCount+=1;
        return clickCount;
    }

    public  int getInitialCount(){

        return clickCount;
    }
}

