package com.example.hazem.firebase.Base;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.hazem.firebase.Features.AddPost.Model.Post;
import com.example.hazem.firebase.Features.Login.Model.User;

import java.util.ArrayList;


/**
 * Created by Hazem on 9/4/2017.
 */

public class FireBaseApplication extends Application {
    private static FireBaseApplication mInstance;
    public static FireBaseApplication getmInstance()
    {
        return mInstance;
    }
    private static User user;

    public static User getUser()
    {
        if (user==null)
        {
            user=new User ("Hazem","hazemahmed45@gmail.com","hazem0000");
        }
        return user;
    }
    private static ArrayList<Post> posts;
    public static ArrayList<Post> getPosts()
    {
        if (posts==null)
        {
            posts=new ArrayList<> ();
            posts.add (new Post ("Hazem","This is content","This is a title"));
            posts.add (new Post ("ahmed","This is content","This is a title"));
            posts.add (new Post ("haroun","This is content","This is a title"));
            posts.add (new Post ("abdel","This is content","This is a title"));
            posts.add (new Post ("moadty","This is content","This is a title"));
        }
        return posts;
    }
    public static void setUser(User newUser)
    {
        user=newUser;
    }

    @Override
    public void onCreate () {
        super.onCreate ();
        mInstance=this;

    }
}
