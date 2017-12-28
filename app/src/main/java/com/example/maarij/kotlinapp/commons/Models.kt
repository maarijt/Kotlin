package com.example.maarij.kotlinapp.commons

import com.example.maarij.kotlinapp.Adapters.AdapterConstants
import com.example.maarij.kotlinapp.Adapters.ViewType

/**
 * Created by maarij on 12/28/17.
 */

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}