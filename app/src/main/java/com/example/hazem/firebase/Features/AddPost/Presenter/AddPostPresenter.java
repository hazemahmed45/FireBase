package com.example.hazem.firebase.Features.AddPost.Presenter;

import android.content.Context;

import com.example.hazem.firebase.Features.AddPost.Model.Post;

/**
 * Created by Hazem on 12/15/2017.
 */

public interface AddPostPresenter {
    public abstract void confirmWritePost();
    public abstract void navigateToHome(Context context);
    public abstract void destroy();
}
