package com.roasloa.tarrot.Controller


import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.roasloa.tarrot.Adapters.TarotCardAdapter
import com.roasloa.tarrot.R
import com.roasloa.tarrot.Utilities.TAROT_CARD_FIRST_PAGE
import kotlinx.android.synthetic.main.activity_tarot_deck.*

class TarotDeckActivity :  FragmentActivity(){


    lateinit var adapter : TarotCardAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarot_deck)

        adapter = TarotCardAdapter(this,this.supportFragmentManager)
        tarotViewPager.adapter = adapter
        tarotViewPager.setPageTransformer(false,adapter)

        tarotViewPager.setCurrentItem(TAROT_CARD_FIRST_PAGE)

        tarotViewPager.offscreenPageLimit = 3

        tarotViewPager.pageMargin = -200


    }
}
