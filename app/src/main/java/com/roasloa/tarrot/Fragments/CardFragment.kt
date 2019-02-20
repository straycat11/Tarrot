package com.roasloa.tarrot.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.roasloa.tarrot.Controller.MainActivity
import com.roasloa.tarrot.R
import kotlinx.android.synthetic.main.activity_fal_selection.*
import kotlinx.android.synthetic.main.card_fragment.*

class CardFragment: Fragment() {

    fun newInstance(context: MainActivity, pos:Int, scale:Float):Fragment {
        val b = Bundle()
        b.putInt("pos", pos)
        b.putFloat("scale", scale)
        return Fragment.instantiate(context, CardFragment::class.java!!.name, b)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

        if(container == null){
            return null
        }

        val linearLayout = inflater.inflate(R.layout.card_fragment, container, false)

        val pos = this.arguments!!["pos"]
        cardPositionTxt.text = "Position = $pos"

        var scale = this.arguments?.getFloat("scale") as Float
        root.setScaleBoth(scale)

        return linearLayout



    }
}