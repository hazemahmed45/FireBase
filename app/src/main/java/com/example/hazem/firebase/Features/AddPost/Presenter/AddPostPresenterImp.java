package com.example.hazem.firebase.Features.AddPost.Presenter;

import android.app.Activity;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.AddPost.View.AddPostActivity;
import com.example.hazem.firebase.Features.AddPost.Model.Post;
import com.example.hazem.firebase.Features.AddPost.View.AddPostView;

/**
 * Created by Hazem on 12/15/2017.
 */

public class AddPostPresenterImp implements AddPostPresenter {
    private AddPostView addPostView;
    private Post post;

    public Post getPost () {
        return post;
    }

    public void setPost (Post post) {
        this.post = post;
    }

    public AddPostPresenterImp (Activity activity) {
        if (activity.getClass ()== AddPostActivity.class)
        {
            addPostView=(AddPostActivity)activity;
        }
    }

    public AddPostPresenterImp (AddPostView view, Post post) {
        addPostView = view;
        this.post = post;
    }

    public AddPostView getAddPostView () {
        return addPostView;
    }

    public void setAddPostView (AddPostView addPostView) {
        this.addPostView = addPostView;
    }

    @Override
    public boolean confirmWritePost (Post post) {

        //final Post post=new Post ("",content,title);
        if (!post.getContent ().equals (null))
        {
            if (!post.getTilte ().equals (null))
            {
                ///// TODO: 12/15/2017
                FireBaseApplication.getPosts ().add(post);
                addPostView.showConfirmToast ();
                return true;
            }

        }
        addPostView.showCancelToast ();
        return false;
    }

}
