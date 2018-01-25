package com.example.hazem.firebase.Features.SignUp.Presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.Login.Model.User;
import com.example.hazem.firebase.Features.SignUp.View.SignUpActivity;
import com.example.hazem.firebase.Features.SignUp.View.SignUpView;

/**
 * Created by Hazem on 12/15/2017.
 */

public class SignUpPresenterImp implements SignUpPresenter {
    private SignUpView signUpView;
    private User user;

    public SignUpPresenterImp (Activity activity) {
        if (activity.getClass ()== SignUpActivity.class)
        {
            signUpView=(SignUpActivity)activity;
        }
    }

    public SignUpPresenterImp (SignUpView signUpView, User user) {
        this.signUpView = signUpView;
        this.user = user;
    }


    @Override
    public void createUser (String email,String name,String password) {
        Handler handler=new Handler ();
        signUpView.showProgressBar ();
        /////////////
        //just to use the show progressbar
        handler.postDelayed (new Runnable () {
            @Override
            public void run () {
                signUpView.closeProgressBar ();
            }
        },2000);
        /////////////
        try
        {
            FireBaseApplication.setUser (new User (name,email,password));
            signUpView.showToast ("Signed up Successfully");
        }
        catch (Exception e)
        {
            signUpView.showToast ("Something went wrong");

        }

        //navigateToHome ();
    }


}
