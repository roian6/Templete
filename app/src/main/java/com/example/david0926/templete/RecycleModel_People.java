package com.example.david0926.templete;

import android.widget.ImageView;

public class RecycleModel_People {
    private String name, msg;
    private ImageView profile;

    public ImageView getProfile() {
        return profile;
    }

    public void setProfile(ImageView profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
