package com.example.ongclogger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class fileAdapter(
    private val files: MutableList<file>
): RecyclerView.Adapter<fileAdapter.fileViewHolder>(){
    class fileViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fileViewHolder {
        return fileViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.file,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: fileViewHolder, position: Int) {
        val curFile=files[position]
        holder.itemView.apply{
            llFile
        }
    }

    override fun getItemCount(): Int {
        return files.size
    }
}
