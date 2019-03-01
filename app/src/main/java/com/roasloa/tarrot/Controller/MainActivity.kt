package com.roasloa.tarrot.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import com.roasloa.tarrot.Adapters.FalRecyclerAdapter
import com.roasloa.tarrot.R
import com.roasloa.tarrot.Services.FalDataService
import com.roasloa.tarrot.Utilities.EXTRA_FAL_TYPE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: FalRecyclerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = FalRecyclerAdapter(this,
            FalDataService.fallar){fal -> val falSelectionIntent = Intent(this,FalSelectionActivity::class.java)
            falSelectionIntent.putExtra(EXTRA_FAL_TYPE,fal.title)
            startActivity(falSelectionIntent)

        }

        falListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        falListView.layoutManager = layoutManager
        falListView.setHasFixedSize(true)


        val anam = FalDataService.falMerge()
        Log.d("SIK", anam)
    }
}
