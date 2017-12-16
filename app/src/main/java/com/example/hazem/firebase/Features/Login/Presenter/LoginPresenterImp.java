package com.example.hazem.firebase.Features.Login.Presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.Login.LoginActivity;
import com.example.hazem.firebase.Features.Login.Model.User;
import com.example.hazem.firebase.Features.Login.View.LoginView;
import com.example.hazem.firebase.Features.SignUp.SignUpActivity;
import com.example.hazem.firebase.Features.main.MainActivity;
import com.example.hazem.firebase.R;

/**
 * Created by Hazem on 12/15/2017.
 */

public class LoginPresenterImp implements LoginPresenter {
    private LoginView loginView;
    private Context context;
    private User user;

    public LoginPresenterImp (LoginActivity activity) {
        loginView=activity;
        context=activity;
    }

    public LoginPresenterImp (LoginView loginView, Context context) {
        this.loginView = loginView;
        this.context = context;
    }

    public LoginPresenterImp (LoginView loginView, Context context, User user) {
        this.loginView = loginView;
        this.context = context;
        this.user = user;
    }

    public LoginView getLoginView () {
        return loginView;
    }

    public void setLoginView (LoginView loginView) {
        this.loginView = loginView;
    }

    public Context getContext () {
        return context;
    }

    public void setContext (Context context) {
        this.context = context;
    }

    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }

    @Override
    public boolean checkUser () {
        //String name=loginView.getEmailEditText ().getText ().toString ();
        String email=loginView.getEmailEditText ().getText ().toString ();
        String password=loginView.getPasswordEditText ().getText ().toString ();
        if (FireBaseApplication.getUser ().getEmail ().equals (email))
        {
            if (FireBaseApplication.getUser ().getPassword ().equals (password))
            {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void confirmedUser () {
        navigateToHome ();
    }

    @Override
    public void refuseUser () {
        Toast.makeText (context, "Sign Up first", Toast.LENGTH_SHORT).show ();
        navigateToSignUp ();
    }

    @Override
    public void navigateToHome () {
        getContext ().startActivity (new Intent (getContext (), MainActivity.class));
    }

    @Override
    public void navigateToSignUp () {
        getContext ().startActivity (new Intent (getContext (),SignUpActivity.class));
    }


}
