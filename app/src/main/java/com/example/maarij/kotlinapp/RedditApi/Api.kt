package com.example.maarij.kotlinapp.RedditApi

/**
 * Created by maarij on 12/28/17.
 */
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface  Api {
    @GET("/top.json")
    fun getTop(@Query("after") after: String,
               @Query("limit") limit: String): Call<RedditNewsResponse>;
}