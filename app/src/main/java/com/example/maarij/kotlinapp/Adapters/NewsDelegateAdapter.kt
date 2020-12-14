package com.example.maarij.kotlinapp.Adapters

/**
 * Created by maarij on 12/28/17.
 */
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.maarij.kotlinapp.R
import com.example.maarij.kotlinapp.commons.RedditNewsItem
import com.example.maarij.kotlinapp.commons.getFriendlyTime
import com.example.maarij.kotlinapp.commons.inflate
import com.example.maarij.kotlinapp.commons.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}