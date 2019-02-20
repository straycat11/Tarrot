package com.roasloa.tarrot.Utilities

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.LinearLayout
import com.roasloa.tarrot.Controller.MainActivity
import com.roasloa.tarrot.Controller.TarotDeckActivity

class MyLinearLayout(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    val scale : Float = BIG_SCALE
    fun setScaleBoth(scale: Float){
        this.scaleX = scale
        this.scaleY = scale
        this.invalidate()
    }

    override fun onDrawForeground(canvas: Canvas?) {

        canvas?.scale(scale,scale, (this.width/2).toFloat(), (this.height/2).toFloat())

        super.onDrawForeground(canvas)


    }
}