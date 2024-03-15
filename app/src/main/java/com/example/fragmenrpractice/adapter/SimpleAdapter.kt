package com.example.fragmenrpractice.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenrpractice.R

// Esto es un adaptador simple para un RecyclerView
class SimpleAdapter(val list: List<String>) :RecyclerView.Adapter<SimpleAdapter.SimpleAdapterViewHolder>(){
    class SimpleAdapterViewHolder(item: View): RecyclerView.ViewHolder(item){
        val textView : TextView = item.findViewById(R.id.text_item)
    }
//    Este método se encarga de crear un nuevo ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.simple_item_list,parent, false)
        return SimpleAdapterViewHolder(view)
    }
//    Este método se encarga de retornar el número de elementos que tiene la lista
    override fun getItemCount(): Int {
        return list.size
    }
//    Este método se encarga de asignar los valores a los elementos de la lista
    override fun onBindViewHolder(holder: SimpleAdapterViewHolder, position: Int) {
        val item = list[position]
        holder.textView.text = item
    }
}