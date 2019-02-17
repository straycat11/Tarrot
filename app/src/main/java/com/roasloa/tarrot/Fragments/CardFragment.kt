package com.roasloa.tarrot.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.roasloa.tarrot.Controller.MainActivity

class CardFragment: Fragment() {

    fun newInstance(context: MainActivity, pos:Int, scale:Float):Fragment {
        val b = Bundle()
        b.putInt("pos", pos)
        b.putFloat("scale", scale)
        return Fragment.instantiate(context, CardFragment::class.java!!.name, b)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}