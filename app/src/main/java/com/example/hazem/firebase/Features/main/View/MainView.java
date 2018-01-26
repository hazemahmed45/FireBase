package com.example.hazem.firebase.Features.main.View;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by Hazem on 12/16/2017.
 */

public interface MainView {
    //public RecyclerView getPostsRecyclerView();
    //public TextView getUserNameTextView();
    //public TextView getEmailTextView();
    //public FloatingActionButton getWritePost();
    // Todo Great XD
    void setUserName();
    void setEmail();
    void setPosts();
    void showProgressBar();
    void closeProgressBar();
}
