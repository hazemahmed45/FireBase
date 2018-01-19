package com.example.hazem.firebase.Features.main;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.AddPost.AddPost;
import com.example.hazem.firebase.Features.main.Presenter.MainPresenter;
import com.example.hazem.firebase.Features.main.Presenter.MainPresenterImp;
import com.example.hazem.firebase.Features.main.View.MainView;
import com.example.hazem.firebase.Features.main.adapter.PostAdapter;
import com.example.hazem.firebase.R;
import com.example.hazem.firebase.Utills.NavigationUtils;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenter presenter;
    private PostAdapter adapter;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);


        presenter=new MainPresenterImp (this);
        setEmail ();
        setUserName ();
        setPosts ();
        getWritePost ().setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                NavigationUtils.NavigateToAddPost (MainActivity.this);
            }
        });
    }

    @Override
    public RecyclerView getPostsRecyclerView () {
        return findViewById (R.id.rv_posts_list);
    }

    @Override
    public TextView getUserNameTextView () {
        return findViewById (R.id.tv_username);
    }

    @Override
    public TextView getEmailTextView () {
        return findViewById (R.id.tv_email);
    }

    @Override
    public FloatingActionButton getWritePost () {
        return findViewById (R.id.fab_write_post_main);
    }
    @Override
    public void setUserName () {
        getEmailTextView ().setText (((MainPresenterImp)presenter). getUser ().getName ());
    }

    @Override
    public void setEmail () {
        getUserNameTextView ().setText (((MainPresenterImp)presenter).getUser ().getEmail ());
    }
    @Override
    public void setPosts () {
        Toast.makeText (this, FireBaseApplication.getPosts ().size ()+"", Toast.LENGTH_SHORT).show ();
        adapter=new PostAdapter (FireBaseApplication.getPosts ());
        getPostsRecyclerView ().setAdapter (adapter);
        getPostsRecyclerView ().setLayoutManager (new LinearLayoutManager (this,LinearLayoutManager.VERTICAL,false));
    }
}
