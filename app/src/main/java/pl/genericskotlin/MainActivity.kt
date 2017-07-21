package pl.genericskotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = recycler_view

        val itemTextView = ItemTextView("Test title")
        val itemsList: List<ItemTextView> = listOf(itemTextView)
        val mainAdapter = MainAdapter(itemsList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mainAdapter
    }
}