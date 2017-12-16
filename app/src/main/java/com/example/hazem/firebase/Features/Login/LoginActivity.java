package com.example.hazem.firebase.Features.Login;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hazem.firebase.Features.Login.Presenter.LoginPresenter;
import com.example.hazem.firebase.Features.Login.Presenter.LoginPresenterImp;
import com.example.hazem.firebase.Features.Login.View.LoginView;
import com.example.hazem.firebase.R;

public class LoginActivity extends AppCompatActivity implements LoginView,View.OnClickListener{

    LoginPresenter presenter;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);
//        Toolbar toolbar = (Toolbar) findViewById (R.id.toolbar);
//        setSupportActionBar (toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById (R.id.fab);
//        fab.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick (View view) {
//                Snackbar.make (view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction ("Action", null).show ();
//            }
//        });
        presenter=new LoginPresenterImp (this);
        getSignInButton ().setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                if (presenter.checkUser ())
                {
                    presenter.navigateToHome ();
                }
                else
                {
                    presenter.refuseUser ();
                }
            }
        });
        getSignUpButton ().setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                presenter.navigateToSignUp ();

            }
        });
    }

    @Override
    public EditText getEmailEditText () {
        return findViewById (R.id.et_email_login);
    }

    @Override
    public EditText getPasswordEditText () {
        return findViewById (R.id.et_password_login);
    }

    @Override
    public Button getSignInButton () {
        return findViewById (R.id.btn_sign_in);
    }

    @Override
    public Button getSignUpButton () {
        return findViewById (R.id.btn_sign_up);
    }

    @Override
    public void onClick (View view) {
//        Toast.makeText (this, "here", Toast.LENGTH_SHORT).show ();
//
//        if (view.getId ()== R.id.btn_sign_in)
//        {
//
//        }
//        else
//        {
//        }
    }
}
