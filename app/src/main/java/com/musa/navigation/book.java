package com.musa.navigation;

import android.net.Uri;
import android.widget.ImageView;

public class book {
    private Uri imageView;
    private  String title;
    private  String description;


    public book() {
        super();
    }

    public book(Uri imageView, String title, String description) {
        this.imageView = imageView;
        this.title = title;
        this.description = description;
    }



    public Uri getImageView() {
        return imageView;
    }

    public void setImageView(Uri imageView) {
        this.imageView = imageView;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }







}
