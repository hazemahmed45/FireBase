package com.example.hazem.firebase.Utills;

import android.app.Activity;
import android.content.Intent;

import com.example.hazem.firebase.Features.AddPost.View.AddPostActivity;
import com.example.hazem.firebase.Features.SignUp.View.SignUpActivity;
import com.example.hazem.firebase.Features.main.View.MainActivity;


/**
 * Created by Hazem on 9/7/2017.
 */

public class NavigationUtils {
    private static Intent intent;
    private static void navigate(Activity activity)
    {
        activity.startActivity (intent);
    }
    public static void NavigateToHome(Activity activity)
    {
        intent=new Intent (activity, MainActivity.class);
        navigate(activity);
    }
    public static void NavigateToSignUp (Activity activity)
    {
        intent= new Intent (activity,SignUpActivity.class);
        navigate (activity);
    }
    public static void NavigateToAddPost(Activity activity)
    {
        intent=new Intent (activity, AddPostActivity.class);
        navigate (activity);
    }
}
