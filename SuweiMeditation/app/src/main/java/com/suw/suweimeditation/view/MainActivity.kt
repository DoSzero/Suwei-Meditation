package com.suw.suweimeditation.view


import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.suw.suweimeditation.R
import com.suw.suweimeditation.adapter.SliderAdapter
import com.suw.suweimeditation.databinding.ActivityMainBinding
import com.suw.suweimeditation.model.listOfPhotos
import com.suw.suweimeditation.util.TransformerUtil
import java.io.IOException


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.apply {
            adapter = SliderAdapter(listOfPhotos())
            offscreenPageLimit = 9
            setPageTransformer(TransformerUtil(9))
            playAudioRaw()
        }


    }


    private fun playAudioRaw() {
        val player = MediaPlayer.create(this,R.raw.mindfulness)
        player.start()
    }

//    private fun playAudioURL() {
//        val audioUrl = "https://cdn.pixabay.com/audio/2022/10/13/audio_c1b863d4dc.mp3"
//        mediaPlayer = MediaPlayer()
//        mediaPlayer!!.setAudioStreamType(AudioManager.STREAM_MUSIC)
//
//        try {
//            mediaPlayer!!.setDataSource(audioUrl)
//            mediaPlayer!!.prepare()
//            mediaPlayer!!.start()
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
//        Toast.makeText(this,"Audio is WORKED", Toast.LENGTH_SHORT).show()
//    }
//
//    private fun pauseAudioURL() {
//        if (mediaPlayer!!.isPlaying) {
//            mediaPlayer!!.stop()
//            mediaPlayer!!.reset()
//            mediaPlayer!!.release()
//        } else {
//            Toast.makeText(this,"Audio is NOT !! WORKED", Toast.LENGTH_SHORT).show()
//        }
//    }


}