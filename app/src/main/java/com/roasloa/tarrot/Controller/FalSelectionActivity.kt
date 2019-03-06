package com.roasloa.tarrot.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import android.widget.Toast
import com.roasloa.tarrot.Adapters.TarotBackAdapter
import com.roasloa.tarrot.R
import com.roasloa.tarrot.Services.FalDataService
import com.roasloa.tarrot.Utilities.ARKADAS_CARD_AMOUNT
import com.roasloa.tarrot.Utilities.EXTRA_FAL_TYPE
import kotlinx.android.synthetic.main.activity_fal_selection.*
import kotlinx.android.synthetic.main.tarot_back.*

class FalSelectionActivity : AppCompatActivity() {

    var selectedCardCount = 0



    lateinit var adapter: TarotBackAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fal_selection)


        val falType = intent.getStringExtra(EXTRA_FAL_TYPE)

        when{
            falType == FalDataService.fallar[0].title -> falSelectionText.text = "Kendin için kart seç."
            falType == FalDataService.fallar[1].title -> falSelectionText.text = "Arkadaşın için kart seç."
            falType == FalDataService.fallar[2].title -> falSelectionText.text = "Sevgilin için kart seç."
        }

        selectedCardCount = 0

        adapter = TarotBackAdapter(this,FalDataService.secilecekKartlar){
                pos,kart ->
            // here the lambda expression carries the position of the item clicked
            // and we can access that element using the following method
            if(selectedCardCount < ARKADAS_CARD_AMOUNT) {
                kart.drawable = ""
                adapter.notifyDataSetChanged()
                selectedCardCount++
            }
//            tarotBackListView.getChildAt(pos)?.visibility = View.INVISIBLE

        }

        val layoutManager = GridLayoutManager(this, 6)






        tarotBackListView.layoutManager = layoutManager
        tarotBackListView.adapter = adapter


    }

    override fun onPause() {
        selectedCardCount = 0
        for (kart in FalDataService.secilecekKartlar){
            kart.drawable = "tarotback"
        }
        super.onPause()
    }
}
