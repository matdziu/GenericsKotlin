package pl.genericskotlin

import android.support.v7.widget.RecyclerView

interface RecyclerItem {

    fun getItemViewType(): Int

    fun onBindViewHolder(holder: RecyclerView.ViewHolder?)
}