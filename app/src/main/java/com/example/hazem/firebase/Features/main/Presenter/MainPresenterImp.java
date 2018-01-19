package com.example.hazem.firebase.Features.main.Presenter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.Login.Model.User;
import com.example.hazem.firebase.Features.main.MainActivity;
import com.example.hazem.firebase.Features.main.View.MainView;
import com.example.hazem.firebase.Features.main.adapter.PostAdapter;

/**
 * Created by Hazem on 12/16/2017.
 */

public class MainPresenterImp implements MainPresenter {
    private MainView mainView;
    private Context context;
    private User user;

    public MainPresenterImp (Activity activity) {
        if (activity.getClass ()== MainActivity.class)
        {
            mainView=(MainActivity)activity;
            context=activity;
        }
        user=FireBaseApplication.getUser ();
    }

    public MainPresenterImp (Activity activity,User user) {
        if (activity.getClass ()== MainActivity.class)
        {
            mainView=(MainActivity)activity;
            context=activity;
        }
        this.user=user;
    }

    public MainView getMainView () {
        return mainView;
    }


    public Context getContext () {
        return context;
    }


    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }




}
