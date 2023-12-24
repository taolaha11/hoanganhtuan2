package com.example.hoanganhlistviewkotlinbai2


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(context: Context, resource: Int, items: List<Item>) :
    ArrayAdapter<Item>(context, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false)

        val item = getItem(position)
        val textView = itemView.findViewById<TextView>(android.R.id.text1)
        textView.text = item?.name

        return itemView
    }
}
