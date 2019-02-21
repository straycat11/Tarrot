package com.roasloa.tarrot.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.roasloa.tarrot.Controller.MainActivity
import com.roasloa.tarrot.R
import com.roasloa.tarrot.Utilities.MyLinearLayout
import kotlinx.android.synthetic.main.activity_fal_selection.*
import kotlinx.android.synthetic.main.card_fragment.*

open class CardFragment: Fragment() {

    companion object {


        fun newInstance(context: MainActivity, pos:Int, scale:Float):Fragment {
            val args: Bundle = Bundle()
            args.putInt("pos", pos)
            args.putFloat("scale", scale)
            val fragment = CardFragment()
            fragment.arguments = args
            return fragment
        }

    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val cardPositionText = container!!.findViewById<TextView>(R.id.cardPositionText)
        val root = container!!.findViewById<MyLinearLayout>(R.id.root)

        if(container == null){
            return null
        }

        val linearLayout = inflater.inflate(R.layout.card_fragment, container, false)

        val pos = this.arguments!!["pos"]
        cardPositionText?.text = "Position = $pos"

        var scale = this.arguments?.getFloat("scale") as Float
        root?.setScaleBoth(scale)

        return linearLayout

        return super.onCreateView(inflater, container, savedInstanceState)



    }
}