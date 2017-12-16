package com.example.hazem.firebase.Features.SignUp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hazem.firebase.Features.SignUp.Presenter.SignUpPresenter;
import com.example.hazem.firebase.Features.SignUp.Presenter.SignUpPresenterImp;
import com.example.hazem.firebase.Features.SignUp.View.SignUpView;
import com.example.hazem.firebase.R;

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
                presenter.createUser ();
            }
        });
    }

    @Override
    public EditText getEmailEditText () {
        return findViewById (R.id.et_email_signup);
    }

    @Override
    public EditText getNameEditText () {
        return findViewById (R.id.et_name_signup);
    }

    @Override
    public EditText getPasswordEditText () {
        return findViewById (R.id.et_password_signup);
    }

    @Override
    public Button getSignUpButton () {
        return findViewById (R.id.btn_signup_signup);
    }
}
