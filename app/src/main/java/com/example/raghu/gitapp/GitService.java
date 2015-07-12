package com.example.raghu.gitapp;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by raghu on 7/12/2015.
 */
public interface GitService {
    @GET("/users/{user}")
    public void getFeed(@Path("user") String user, Callback<GitModel> response);
}
