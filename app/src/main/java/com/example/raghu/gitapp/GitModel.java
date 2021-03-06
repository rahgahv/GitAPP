package com.example.raghu.gitapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by raghu on 7/12/2015.
 */
public class GitModel {
    @SerializedName("name")
    private String mName;

    @SerializedName("location")
    private String mLocation;

    @SerializedName("id")
    private int mID;

    @SerializedName("company")
    private String mCompany;

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getID() {
        return mID;
    }


    public String getCompany() {
        return mCompany;
    }
}
