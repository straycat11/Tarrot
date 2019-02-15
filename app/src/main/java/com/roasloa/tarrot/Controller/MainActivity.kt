package com.roasloa.tarrot.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.roasloa.tarrot.Adapters.FalRecyclerAdapter
import com.roasloa.tarrot.R
import com.roasloa.tarrot.Services.FalDataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: FalRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = FalRecyclerAdapter(this,
            FalDataService.fallar){it -> Toast.makeText(this,"Başarılııı xd: ${it.title}", Toast.LENGTH_SHORT).show()

        }

        falListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        falListView.layoutManager = layoutManager
        falListView.setHasFixedSize(true)


    }
}
