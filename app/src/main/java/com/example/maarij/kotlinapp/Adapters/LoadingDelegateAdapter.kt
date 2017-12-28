package com.example.maarij.kotlinapp.Adapters

/**
 * Created by maarij on 12/28/17.
 */

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.maarij.kotlinapp.R
import com.example.maarij.kotlinapp.commons.inflate


class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading))
}

