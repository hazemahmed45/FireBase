package com.example.hazem.firebase.Features.AddPost;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hazem.firebase.Features.AddPost.Presenter.AddPostPresenter;
import com.example.hazem.firebase.Features.AddPost.Presenter.AddPostPresenterImp;
import com.example.hazem.firebase.Features.AddPost.View.AddPostView;
import com.example.hazem.firebase.R;

public class AddPost extends AppCompatActivity implements AddPostView{


    AddPostPresenter presenter;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_add_post);
        presenter=new AddPostPresenterImp (this);

        getWritePostFab ().setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                presenter.confirmWritePost ();

            }
        });
    }

    @Override
    public EditText getPostTitleEditText () {
        return findViewById (R.id.et_post_title);
    }

    @Override
    public EditText getPostContentEditText () {
        return findViewById (R.id.et_post_content);
    }

    @Override
    public FloatingActionButton getWritePostFab () {
        return findViewById (R.id.fab_write_post);
    }


}
