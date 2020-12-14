package com.example.maarij.kotlinapp.apis.youtubeapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeApi {
    //https://youtube.googleapis.com/youtube/v3/videos?part=snippet%2CcontentDetails%2Cstatistics&chart=mostPopular&regionCode=US&key=[YOUR_API_KEY]
    @GET("videos")
    fun getTopVideos(
            @Query("part") part: List<String>,
            @Query("chart") chart: String,
            @Query("regionCode") regionCode: String,
            @Query("key") key: String) : Call<YoutubeVideosResponse>
}