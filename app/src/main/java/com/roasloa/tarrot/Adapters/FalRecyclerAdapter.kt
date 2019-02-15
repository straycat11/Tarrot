package com.roasloa.tarrot.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.roasloa.tarrot.Model.Fal
import com.roasloa.tarrot.R

class FalRecyclerAdapter(val context: Context,
                         val fallar: List<Fal>,
                         val itemClick:(Fal)->Unit): RecyclerView.Adapter<FalRecyclerAdapter.Holder>(){


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.fal_selection_layout, p0, false)
        return Holder(view, itemClick)    }

    override fun getItemCount(): Int {
        return fallar.count()
    }

    override fun onBindViewHolder(p0: Holder, p1: Int) {
        p0?.bindFal(fallar[p1], context)
    }

    inner class Holder(itemView: View, val itemClick: (Fal) -> Unit) : RecyclerView.ViewHolder(itemView){
        val falDesc = itemView?.findViewById<TextView>(R.id.falDesc)
        val falTitle = itemView?.findViewById<TextView>(R.id.falTitle)

        fun bindFal(fal: Fal, context: Context){

            falDesc?.text = fal.description
            falTitle?.text = fal.title
            itemView.setOnClickListener{itemClick(fal)}
        }
    }
}