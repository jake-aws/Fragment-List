package com.example.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.databinding.FragmentListBinding

import com.example.fragment.databinding.ListItemBinding

class ListViewAdapter(private val items:ArrayList<Item>):RecyclerView.Adapter<ListViewAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.imageView)
        val itemTitle: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currentItem = items[position]
        holder.itemImage.setImageResource(currentItem.image)
        holder.itemTitle.text = currentItem.title
    }

    override fun getItemCount(): Int = items.size
}