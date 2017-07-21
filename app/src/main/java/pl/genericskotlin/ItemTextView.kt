package pl.genericskotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.item_text_view.view.*

class ItemTextView(val title: String) : RecyclerItem {

    override fun getItemViewType(): Int {
        return R.layout.item_text_view
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?) {
        (holder as? ViewHolder)?.bind(title)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView = view.text_view

        fun bind(title: String) {
            textView.text = title
        }
    }
}