//package com.example.maarij.kotlinapp.apis.redditapi
//
///**
// * Created by maarij on 12/28/17.
// */
//import retrofit2.Call
//import retrofit2.Retrofit
//import retrofit2.converter.moshi.MoshiConverterFactory
//
//class RestAPI {
//
//    private val redditApi: Api
//
//    init {
//        val retrofit = Retrofit.Builder()
//                .baseUrl("https://www.reddit.com")
//                .addConverterFactory(MoshiConverterFactory.create())
//                .build()
//
//        redditApi = retrofit.create(Api::class.java)
//    }
//
//    fun getNews(after: String, limit: String): Call<RedditNewsResponse> {
//        return redditApi.getTop(after, limit)
//    }
//}

package com.example.maarij.kotlinapp.apis.youtubeapi

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class YoutubeRestApi {
    private val youtubeApi: YoutubeApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://youtube.googleapis.com/youtube/v3/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
        youtubeApi = retrofit.create(YoutubeApi::class.java)

        GlobalScope.launch {
            val part = listOf("snippet")
            val data =  youtubeApi.getTopVideos(part, "mostPopular", "US", "AIzaSyCK7lVgLZ78Gwv4weyYk1BHst1yhs4v7f4").execute()
        }
    }

    fun getVideos(): Call<YoutubeVideosResponse> {
        val part = listOf("snippet")
        val data =  youtubeApi.getTopVideos(part, "mostPopular", "US", "AIzaSyCK7lVgLZ78Gwv4weyYk1BHst1yhs4v7f4")
        return data
    }
}