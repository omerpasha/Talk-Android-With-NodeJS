package com.example.retrodeneme;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
//metod üret
    @GET("login")
    Call<List<Post>> getPosts();

}
