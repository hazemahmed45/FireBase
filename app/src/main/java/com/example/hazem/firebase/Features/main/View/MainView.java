package com.example.hazem.firebase.Features.main.View;

import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.hazem.firebase.Features.main.adapter.PostAdapter;

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
    void setPostsAdapter(PostAdapter adapter);
    void showProgressBar();
    void closeProgressBar();
    void NavigateToAddPost();
}
