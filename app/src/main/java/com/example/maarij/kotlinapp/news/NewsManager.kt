package com.example.maarij.kotlinapp.news

/**
 * Created by maarij on 12/28/17.
 */

import com.example.maarij.kotlinapp.commons.RedditNewsItem
import rx.Observable
class NewsManager() {

    fun getNews(): Observable<List<RedditNewsItem>> {
        return Observable.create {
            subscriber ->

            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author$i",
                        "Title $i",
                        i, // number of comments
                        1457207701L - i * 200, // time
                        "http://lorempixel.com/200/200/technics/$i", // image url
                        "url"
                ))
            }
            subscriber.onNext(news)
        }
    }
}