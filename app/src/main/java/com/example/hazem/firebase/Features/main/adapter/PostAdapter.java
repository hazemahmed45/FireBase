package com.example.hazem.firebase.Features.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.hazem.firebase.Features.AddPost.Model.Post;
import com.example.hazem.firebase.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Hazem on 9/5/2017.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder>{
    private ArrayList<Post> posts;

    public PostAdapter (ArrayList<Post> posts) {
        this.posts = posts;
    }

    @Override
    public PostHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view=LayoutInflater.from (parent.getContext ()).inflate (R.layout.post_layout,parent,false);

        return new PostHolder (view);
    }
    @Override
    public void onBindViewHolder (PostHolder holder, int position) {
        holder.setData (position);
    }

    @Override
    public int getItemCount () {
        return posts.size ();
    }



    public class PostHolder extends RecyclerView.ViewHolder {
        TextView Author,Content,Title;

        public PostHolder (View itemView) {
            super (itemView);
            Author=itemView.findViewById (R.id.tv_post_author);
            Content=itemView.findViewById (R.id.tv_post_content);
            Title=itemView.findViewById (R.id.tv_post_title);
        }
        // TODO  we agreed that the position of this function is outside the class
        private void setData(int position)
        {
            Post post=posts.get (position);
            Author.setText (post.getAuther ());
            Content.setText (post.getContent ());
            Title.setText (post.getTilte ());
        }


    }
}
