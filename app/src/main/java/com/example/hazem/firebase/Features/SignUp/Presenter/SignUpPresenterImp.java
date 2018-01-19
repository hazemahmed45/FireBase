package com.example.hazem.firebase.Features.SignUp.Presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.Login.Model.User;
import com.example.hazem.firebase.Features.SignUp.SignUpActivity;
import com.example.hazem.firebase.Features.SignUp.View.SignUpView;
import com.example.hazem.firebase.Features.main.MainActivity;

/**
 * Created by Hazem on 12/15/2017.
 */

public class SignUpPresenterImp implements SignUpPresenter {
    private SignUpView signUpView;
    private Context context;
    private User user;

    public SignUpPresenterImp (Activity activity) {
        if (activity.getClass ()== SignUpActivity.class)
        {
            context=activity;
            signUpView=(SignUpActivity)activity;
        }
    }

    public SignUpPresenterImp (SignUpView signUpView, Context context, User user) {
        this.signUpView = signUpView;
        this.context = context;
        this.user = user;
    }

    public Context getContext () {
        return context;
    }

    @Override
    public void createUser () {
        String email=signUpView.getEmailEditText ().getText ().toString ();
        String name=signUpView.getNameEditText ().getText ().toString ();
        String password=signUpView.getPasswordEditText ().getText ().toString ();
        FireBaseApplication.setUser (new User (name,email,password));
        //navigateToHome ();
    }


}
