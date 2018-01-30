package com.example.hazem.firebase.Features.Login.Presenter;

import android.content.Context;
import android.os.Handler;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.Login.View.LoginActivity;
import com.example.hazem.firebase.Features.Login.Model.User;
import com.example.hazem.firebase.Features.Login.View.LoginView;

/**
 * Created by Hazem on 12/15/2017.
 */

public class LoginPresenterImp implements LoginPresenter {
    private LoginView loginView;
    private User user;


    public LoginPresenterImp (LoginView loginView) {
        this.loginView = loginView;

    }


    public LoginView getLoginView () {
        return loginView;
    }

    public void setLoginView (LoginView loginView) {
        this.loginView = loginView;
    }



    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }

    @Override
    public boolean checkUser (String email,String password) {
        getLoginView ().ShowProgressBar ();
        Handler handler=new Handler ();
        handler.postDelayed (new Runnable () {
            @Override
            public void run () {
                getLoginView ().closeProgressBar ();
            }
        },2000);
        if (FireBaseApplication.getUser ().getEmail ().equals (email))
        {
            if (FireBaseApplication.getUser ().getPassword ().equals (password))
            {
                getLoginView ().confirmToast ();
                return true;
            }
            getLoginView ().denyToast ();
            return false;
        }
        getLoginView ().denyToast ();
        return false;
    }





}
