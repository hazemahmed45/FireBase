package com.example.hazem.firebase.Features.SignUp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.hazem.firebase.Features.SignUp.Presenter.SignUpPresenter;
import com.example.hazem.firebase.Features.SignUp.Presenter.SignUpPresenterImp;
import com.example.hazem.firebase.R;
import com.example.hazem.firebase.Utills.NavigationUtils;

public class SignUpActivity extends AppCompatActivity implements SignUpView{

    SignUpPresenter presenter;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_up);
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
        presenter=new SignUpPresenterImp (this);
        getSignUpButton ().setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                presenter.createUser (getEmailEditText ().getText ().toString (),getNameEditText ().getText ().toString (),getPasswordEditText ().getText ().toString ());
                NavigationUtils.NavigateToHome (SignUpActivity.this);
            }
        });
    }

    public EditText getEmailEditText () {
        return findViewById (R.id.et_email_signup);
    }

    public EditText getNameEditText () {
        return findViewById (R.id.et_name_signup);
    }

    public EditText getPasswordEditText () {
        return findViewById (R.id.et_password_signup);
    }

    public Button getSignUpButton () {
        return findViewById (R.id.btn_signup_signup);
    }

    public ProgressBar getProgressBar()
    {
        return findViewById (R.id.pb_signup);
    }

    @Override
    public void showToast (String msg) {
        Toast.makeText (this, msg, Toast.LENGTH_SHORT).show ();
    }

    @Override
    public void showProgressBar () {
        getProgressBar ().setVisibility (View.VISIBLE);
    }

    @Override
    public void closeProgressBar () {
        getProgressBar ().setVisibility (View.GONE);
    }
}
