@file:JvmName("ExtensionsUtils")

package com.example.maarij.kotlinapp.commons


import android.text.TextUtils
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.maarij.kotlinapp.R
import com.squareup.picasso.Picasso

/**
 * Created by maarij on 12/28/17.
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return android.view.LayoutInflater.from(context).inflate(layoutId, this, false)
}

fun ImageView.loadImg(imageUrl: String) {
    if (TextUtils.isEmpty(imageUrl)) {
        Picasso.with(context).load(R.mipmap.ic_launcher).into(this)
    } else {
        Picasso.with(context).load(imageUrl).into(this)
    }
}
