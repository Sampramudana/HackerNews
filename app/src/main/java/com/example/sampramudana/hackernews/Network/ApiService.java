package com.example.sampramudana.hackernews.Network;

import com.example.sampramudana.hackernews.Model.ResponseData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("top-headlines?sources=hacker-news&apiKey=0a3624cc60104378b8ac6bb15d4dcd78")
    Call<ResponseData> readNewsApi();
}
