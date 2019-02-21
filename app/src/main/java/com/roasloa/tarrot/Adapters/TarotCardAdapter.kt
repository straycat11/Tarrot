package com.roasloa.tarrot.Adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.view.View
import com.roasloa.tarrot.Controller.MainActivity
import com.roasloa.tarrot.Fragments.CardFragment
import com.roasloa.tarrot.R
import com.roasloa.tarrot.Utilities.*

class TarotCardAdapter(context: Context, fm: FragmentManager): FragmentPagerAdapter(fm), ViewPager.PageTransformer {


    lateinit var current: MyLinearLayout
    lateinit var next: MyLinearLayout
    var scale: Float = 0F




    override fun getItem(p0: Int): Fragment {
        if(p0 == TAROT_CARD_FIRST_PAGE){
            scale = BIG_SCALE
        }else scale = SMALL_SCALE



        val newPosition = p0 % TAROT_CARD_COUNT

        return CardFragment.newInstance(MainActivity(),newPosition, scale)

    }

    override fun getCount(): Int {
        return TAROT_CARD_COUNT * TAROT_CARD_LOOPS
    }

    override fun transformPage(p0: View, p1: Float) {

        val tarotLinearLayout: MyLinearLayout = p0.findViewById(R.id.root)

        scale = BIG_SCALE
        if(p1 > 0){
            scale -= p1 * DIFF_SCALE
        }
        else{
            scale += p1 * DIFF_SCALE
        }

        if(scale<0)scale = 0F
        tarotLinearLayout.setScaleBoth(scale)
    }
}