package com.example.android

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class GroupAdapater(private val list: ArrayList<GroupApp>, private val context: Context) : RecyclerView.Adapter<GroupAdapater.ViewHolder>(){

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nameGroupApp: TextView = view.findViewById(R.id.nameGroup)
        val listApp: RecyclerView = view.findViewById(R.id.recyclerViewApp)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupAdapater.ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_app_store, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: GroupAdapater.ViewHolder, position: Int) {
        holder.nameGroupApp.text = list[position].nameGroup
        val groupCustom: AppAdapter = AppAdapter(list[position].listApp)
        holder.listApp.adapter = groupCustom
        holder.listApp.layoutManager = LinearLayoutManager(
            this.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
