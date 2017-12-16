package com.example.hazem.firebase.Features.Login.Presenter;

/**
 * Created by Hazem on 12/15/2017.
 */

public interface LoginPresenter {
    public boolean checkUser();
    public void confirmedUser();
    public void refuseUser();
    public void navigateToHome();
    public void navigateToSignUp();
}
