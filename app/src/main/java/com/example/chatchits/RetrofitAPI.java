package com.example.chatchits;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface RetrofitAPI {


    @GET
    Call<MsgModal> getMessage(@Url String url);


    @POST
    Call<MsgModal> postMessage(@Url String url);
}