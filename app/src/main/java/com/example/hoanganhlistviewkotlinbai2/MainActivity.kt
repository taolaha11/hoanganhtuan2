package com.example.hoanganhlistviewkotlinbai2

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf(
            Item("Item 1"),
            Item("Item 2"),
            Item("Item 3"),
        )

        val listView: ListView = findViewById(R.id.listView)
        val adapter = CustomAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter
    }
}
