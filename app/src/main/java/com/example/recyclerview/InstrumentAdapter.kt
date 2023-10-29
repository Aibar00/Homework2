package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InstrumentAdapter (private val instrumentList : ArrayList<Instrument>):RecyclerView.Adapter<InstrumentAdapter.InstrumentViewHolder>(){
    class InstrumentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val instrumentImage : ImageView = itemView.findViewById(R.id.iv_guitar)
        val instrumentName : TextView = itemView.findViewById(R.id.tv_guitar_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstrumentViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(
            R.layout.instrument_item,
            parent,false)
        return InstrumentViewHolder(viewLayout)
    }

    override fun getItemCount() = instrumentList.size

    override fun onBindViewHolder(holder: InstrumentViewHolder, position: Int) {
        val currentFood = instrumentList[position]
        holder.instrumentImage.setImageResource(currentFood.instrumentImage)
        holder.instrumentName.text = currentFood.instrumentName
    }
}