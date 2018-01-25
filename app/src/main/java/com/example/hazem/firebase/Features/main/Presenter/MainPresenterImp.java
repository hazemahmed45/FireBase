package com.example.hazem.firebase.Features.main.Presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.Login.Model.User;
import com.example.hazem.firebase.Features.main.View.MainActivity;
import com.example.hazem.firebase.Features.main.View.MainView;

/**
 * Created by Hazem on 12/16/2017.
 */

public class MainPresenterImp implements MainPresenter {
    private MainView mainView;
    private User user;

    public MainPresenterImp (Activity activity) {
        if (activity.getClass ()== MainActivity.class)
        {
            mainView=(MainActivity)activity;
        }
        user=FireBaseApplication.getUser ();
    }

    public MainPresenterImp (Activity activity,User user) {
        if (activity.getClass ()== MainActivity.class)
        {
            mainView=(MainActivity)activity;
        }
        this.user=user;
    }

    public MainView getMainView () {
        return mainView;
    }




    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }


    @Override
    public void setData () {
        Handler handler=new Handler ();
        mainView.showProgressBar ();
        handler.postDelayed (new Runnable () {
            @Override
            public void run () {
                mainView.closeProgressBar ();
            }
        },2000);
        mainView.setEmail ();
        mainView.setUserName ();
        mainView.setPosts ();
    }
}
