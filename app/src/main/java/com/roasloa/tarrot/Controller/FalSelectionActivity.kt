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
import kotlinx.android.synthetic.main.activity_fal_selection.*
import kotlinx.android.synthetic.main.tarot_back.*

class FalSelectionActivity : AppCompatActivity() {

    lateinit var adapter: TarotBackAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fal_selection)

        adapter = TarotBackAdapter(this,FalDataService.secilecekKartlar){
                pos,_ ->
            // here the lambda expression carries the position of the item clicked
            // and we can access that element using the following method
            tarotBackListView.getChildAt(pos)?.visibility = View.INVISIBLE

        }

        val layoutManager = GridLayoutManager(this, 6)






        tarotBackListView.layoutManager = layoutManager
        tarotBackListView.adapter = adapter


    }
}
