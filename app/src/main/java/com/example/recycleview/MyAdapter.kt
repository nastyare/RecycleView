package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context, private val colorList: ArrayList<ColorData>): RecyclerView.Adapter<MyAdapter.myViewHolder>() {
    class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val myColorImg: View = itemView.findViewById(R.id.view_color)
        val myTextView: TextView = itemView.findViewById(R.id.textView)
    }

    //вызывается каждый раз, когда надо создать новый элемент списка
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rview_item, parent, false)
        return myViewHolder(view)
    }

    //количество элементов
    override fun getItemCount(): Int {
        return colorList.size
    }
    //связь данных с представлением view
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val data = colorList[position]
        holder.myColorImg.setBackgroundColor(data.colorHex)
        holder.myTextView.text = data.colorName
    }
}