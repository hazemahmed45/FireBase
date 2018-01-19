package com.example.hazem.firebase.Utills;

import android.app.Activity;
import android.content.Intent;

import com.example.hazem.firebase.Features.AddPost.AddPost;
import com.example.hazem.firebase.Features.SignUp.SignUpActivity;
import com.example.hazem.firebase.Features.main.MainActivity;


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
        intent=new Intent (activity, AddPost.class);
        navigate (activity);
    }
}
