package pl.genericskotlin

import android.support.v7.widget.RecyclerView

interface RecyclerItem<in T : RecyclerView.ViewHolder> {

    fun getItemViewType(): Int

    fun onBindViewHolder(holder: T?)
}