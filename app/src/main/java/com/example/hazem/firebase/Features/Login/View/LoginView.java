package com.example.hazem.firebase.Features.Login.View;

import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Hazem on 12/15/2017.
 */

public interface LoginView {
    public abstract EditText getEmailEditText();
    public abstract EditText getPasswordEditText();
    public abstract Button getSignInButton();
    public abstract Button getSignUpButton();
}
