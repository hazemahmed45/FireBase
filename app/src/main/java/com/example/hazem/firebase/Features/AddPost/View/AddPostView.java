package com.example.hazem.firebase.Features.AddPost.View;

import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.widget.EditText;

/**
 * Created by Hazem on 12/15/2017.
 */

public interface AddPostView {
    //public abstract void setViews();
    //public abstract EditText getPostTitleEditText();
    //public abstract EditText getPostContentEditText();
    //public abstract FloatingActionButton getWritePostFab();
    void showConfirmToast();
    void showCancelToast();
    void finishActivity(Activity activity);
}
