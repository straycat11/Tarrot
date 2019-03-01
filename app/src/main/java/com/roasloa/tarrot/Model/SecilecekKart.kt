package com.roasloa.tarrot.Model

import android.view.View
import android.widget.ImageView

class SecilecekKart(val drawable: String, var visibility: Boolean, var id: Int) {

    val kartId = this.id

    override fun toString(): String {
        return this.drawable
    }

}