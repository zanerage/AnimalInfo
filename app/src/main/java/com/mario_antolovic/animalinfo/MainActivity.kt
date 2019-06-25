package com.mario_antolovic.animalinfo

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity: AppCompatActivity() {

    // Create a VideoView variable, a MediaPlayer variable, and an int to hold the current
    // video position.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_invertebrates.setOnClickListener {
            val invertb = Intent (this,invertebrates::class.java)
            startActivity(invertb)
        }
        btn_amphib.setOnClickListener {
            val ampi = Intent(this,Amphibians::class.java)
            startActivity(ampi)
        }
        btn_birds.setOnClickListener {
            val bird = Intent(this,birds::class.java)
            startActivity(bird)
        }
        btn_mammals.setOnClickListener {
            val mamma = Intent(this,mammals::class.java)
            startActivity(mamma)
        }
        btn_rept.setOnClickListener {
            val reptil = Intent(this,reptiles::class.java)
            startActivity(reptil)
        }
       btn_fish.setOnClickListener {
           val riba = Intent(this,fish::class.java)
           startActivity(riba)
       }
    }
}