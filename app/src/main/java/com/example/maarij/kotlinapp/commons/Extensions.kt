@file:JvmName("ExtensionsUtils")

package com.example.maarij.kotlinapp.commons


import android.view.View
import android.view.ViewGroup

/**
 * Created by maarij on 12/28/17.
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return android.view.LayoutInflater.from(context).inflate(layoutId, this, false)
}

