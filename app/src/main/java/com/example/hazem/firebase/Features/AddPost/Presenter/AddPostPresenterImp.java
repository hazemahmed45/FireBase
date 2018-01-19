package com.example.hazem.firebase.Features.AddPost.Presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.AddPost.AddPost;
import com.example.hazem.firebase.Features.AddPost.Model.Post;
import com.example.hazem.firebase.Features.AddPost.View.AddPostView;
import com.example.hazem.firebase.Features.main.MainActivity;

/**
 * Created by Hazem on 12/15/2017.
 */

public class AddPostPresenterImp implements AddPostPresenter {
    private AddPostView addPostView;
    private Post post;
    private Context context;

    public Context getContext () {
        return context;
    }

    public void setContext (Context context) {
        this.context = context;
    }


    public Post getPost () {
        return post;
    }

    public void setPost (Post post) {
        this.post = post;
    }

    public AddPostPresenterImp (Activity activity) {
        if (activity.getClass ()== AddPost.class)
        {
            context=(AddPost)activity;
            addPostView=(AddPost)activity;
        }
    }

    public AddPostPresenterImp (AddPostView view, Post post) {
        addPostView = view;
        this.post = post;
    }

    @Override
    public boolean confirmWritePost (Post post) {

        //final Post post=new Post ("",content,title);
        if (!post.getContent ().equals (null))
        {
            if (!post.getTilte ().equals (null))
            {
                ///// TODO: 12/15/2017
                FireBaseApplication.getPosts ().add (post);
                return true;
            }

        }
        return false;
    }

}
