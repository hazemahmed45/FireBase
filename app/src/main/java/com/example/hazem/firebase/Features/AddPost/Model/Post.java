package com.example.hazem.firebase.Features.AddPost.Model;

/**
 * Created by Hazem on 12/15/2017.
 */

public class Post {
    private String auther;
    private String content;
    private String tilte;

    public Post () {
    }

    public String getAuther () {
        return auther;
    }

    public void setAuther (String auther) {
        this.auther = auther;
    }

    public String getContent () {
        return content;
    }

    public void setContent (String content) {
        this.content = content;
    }

    public String getTilte () {
        return tilte;
    }

    public void setTilte (String tilte) {
        this.tilte = tilte;
    }

    public Post (String auther, String content, String tilte) {
        this.auther = auther;
        this.content = content;
        this.tilte = tilte;
    }
}
