package com.roasloa.tarrot.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.roasloa.tarrot.Model.SecilecekKart
import com.roasloa.tarrot.R

class TarotBackAdapter(val context: Context, val kartlar: List<SecilecekKart>, val itemClick: (Int, SecilecekKart)->Unit)
    : RecyclerView.Adapter<TarotBackAdapter.KartHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): KartHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.tarot_back, p0, false)

        return KartHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return kartlar.count()
    }


    override fun onBindViewHolder(p0: KartHolder, p1: Int) {
        p0?.bindKart(kartlar[p1], context)
    }

    inner class KartHolder(itemView: View?, val itemClick: (Int, SecilecekKart) -> Unit) : RecyclerView.ViewHolder(itemView!!){
        val kartImage = itemView?.findViewById<ImageView>(R.id.tarotBackImage)

        fun bindKart(secilecekKart: SecilecekKart, context: Context) {
            val resourceId = context.resources.getIdentifier(secilecekKart.drawable, "drawable",context.packageName)
            kartImage?.setImageResource(resourceId)
            var position = secilecekKart.kartId
            itemView.setOnClickListener{itemClick(position, secilecekKart)}
        }
    }

}