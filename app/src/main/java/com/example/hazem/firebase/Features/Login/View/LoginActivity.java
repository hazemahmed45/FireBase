package com.example.hazem.firebase.Features.Login.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.hazem.firebase.Features.Login.Presenter.LoginPresenter;
import com.example.hazem.firebase.Features.Login.Presenter.LoginPresenterImp;
import com.example.hazem.firebase.R;
import com.example.hazem.firebase.Utills.NavigationUtils;

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
                if (presenter.checkUser (getEmailEditText ().getText ().toString (),getPasswordEditText ().getText ().toString ()))
                {

                    NavigationUtils.NavigateToHome (LoginActivity.this);
                }

            }
        });
        getSignUpButton ().setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                NavigationUtils.NavigateToSignUp (LoginActivity.this);

            }
        });
    }


    public EditText getEmailEditText () {
        return findViewById (R.id.et_email_login);
    }

    public EditText getPasswordEditText () {
        return findViewById (R.id.et_password_login);
    }

    public Button getSignInButton () {
        return findViewById (R.id.btn_sign_in);
    }


    public Button getSignUpButton () {
        return findViewById (R.id.btn_sign_up);
    }

    public ProgressBar getProgressBar()
    {
        return findViewById (R.id.pb_login);
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

    @Override
    public void ShowProgressBar () {
        getProgressBar ().setVisibility (View.VISIBLE);
    }

    @Override
    public void closeProgressBar () {
        getProgressBar ().setVisibility (View.GONE);
    }

    @Override
    public void confirmToast () {
        Toast.makeText (this, "Email successfully Logged in", Toast.LENGTH_SHORT).show ();
    }

    @Override
    public void denyToast () {
        Toast.makeText (this, "Login was not succussful,please signup", Toast.LENGTH_SHORT).show ();

    }
}
