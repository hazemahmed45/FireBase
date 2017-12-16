package com.example.hazem.firebase.Features.SignUp.View;

import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Hazem on 12/15/2017.
 */

public interface SignUpView {
    public abstract EditText getEmailEditText();
    public abstract EditText getNameEditText();
    public abstract EditText getPasswordEditText();
    public abstract Button getSignUpButton();
}
