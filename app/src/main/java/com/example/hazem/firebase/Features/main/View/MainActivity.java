package com.example.hazem.firebase.Features.main.View;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hazem.firebase.Base.FireBaseApplication;
import com.example.hazem.firebase.Features.main.Presenter.MainPresenter;
import com.example.hazem.firebase.Features.main.Presenter.MainPresenterImp;
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
        getWritePost ().setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                NavigationUtils.NavigateToAddPost (MainActivity.this);
            }
        });
    }

    @Override
    protected void onResume () {
        super.onResume ();
        presenter.setData ();

    }

    public RecyclerView getPostsRecyclerView () {
        return findViewById (R.id.rv_posts_list);
    }

    public TextView getUserNameTextView () {
        return findViewById (R.id.tv_username);
    }

    public TextView getEmailTextView () {
        return findViewById (R.id.tv_email);
    }

    public FloatingActionButton getWritePost () {
        return findViewById (R.id.fab_write_post_main);
    }

    public ProgressBar getProgressBar()
    {
        return findViewById (R.id.pb_main);
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

    @Override
    public void showProgressBar () {
        getProgressBar ().setVisibility (View.VISIBLE);
    }

    @Override
    public void closeProgressBar () {
        getProgressBar ().setVisibility (View.GONE);

    }
}
