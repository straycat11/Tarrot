package com.roasloa.tarrot.Model

import android.view.View
import android.widget.ImageView

class SecilecekKart(val drawable: String, var visibility: Boolean) {
    override fun toString(): String {
        return this.drawable
    }

    fun setVisibility(view: ImageView, visibility: Boolean){
        if(visibility){
            view.visibility = View.VISIBLE
        }else{
            view.visibility = View.INVISIBLE
        }
    }
}