package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(
    private var titles: List<String>,
    private var descriptions: List<String>,
    private var contents: List<String>,
    private var images: List<Int>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv_title: TextView = itemView.findViewById(R.id.tv_title)
        var tv_description: TextView = itemView.findViewById(R.id.tv_description)
        var tv_content: TextView = itemView.findViewById(R.id.tv_content)
        var iv_image: ImageView = itemView.findViewById(R.id.iv_image)

        init {
            itemView.setOnClickListener {
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "item ${position + 1}", Toast.LENGTH_SHORT).show()
                // do something with the click
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_title.text = titles[position]
        holder.tv_description.text = descriptions[position]
        holder.tv_content.text = contents[position]
        holder.iv_image.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size // or the size of any of the other parameters
    }
}