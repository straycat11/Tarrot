package com.roasloa.tarrot.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.daimajia.slider.library.Indicators.PagerIndicator
import com.daimajia.slider.library.SliderLayout
import com.daimajia.slider.library.SliderTypes.BaseSliderView
import com.daimajia.slider.library.SliderTypes.DefaultSliderView
import com.roasloa.tarrot.R
import com.roasloa.tarrot.Utilities.EXTRA_FAL_TYPE
import kotlinx.android.synthetic.main.activity_fal_selection.*

class FalSelectionActivity : AppCompatActivity() {

    val sliderView = DefaultSliderView(this)

    var gecmisKart = 0
    var simdiKart = 0
    var gelecekKart = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fal_selection)
        val falTitle = intent.getStringExtra(EXTRA_FAL_TYPE)


        val resourceId = resources.getIdentifier("tarotback","drawable",packageName)
        sliderView.image(resourceId)
        falClosedSlider.indicatorVisibility = PagerIndicator.IndicatorVisibility.Invisible
        falSelectionText.text = "Geçmişin için 3 kart seç."

        sliderView.setOnSliderClickListener {

            while (gecmisKart != 3) {
            gecmisKart++
            falSelectionText.text = "Geçmişin için ${3-gecmisKart} kart seç."
            break
        }
            while (simdiKart != 4 && gecmisKart == 3) {
                simdiKart++
                falSelectionText.text = "Şu anki hayatın için ${4-simdiKart} kart seç."
                break
            }

            while (gelecekKart != 4 && simdiKart == 4 && gecmisKart == 3) {
                gelecekKart++
                falSelectionText.text = "Geleceğin için ${4-gelecekKart} kart seç."
                break
            }
            while (gelecekKart == 4 && simdiKart == 4 && gecmisKart == 3){

                val falResultIntent = Intent(this, FalResultActivity::class.java)
                startActivity(falResultIntent)

            }


        }
        falClosedSlider.setSliderTransformDuration(350,null)
        falClosedSlider.setDuration(1000)

        falClosedSlider.addSlider(sliderView)

    }

    override fun onStop() {
        super.onStop()
        falClosedSlider.stopAutoCycle()
    }

}
