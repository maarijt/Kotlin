package com.example.maarij.kotlinapp.adapters

/**
 * Created by maarij on 12/28/17.
 */
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup

interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}