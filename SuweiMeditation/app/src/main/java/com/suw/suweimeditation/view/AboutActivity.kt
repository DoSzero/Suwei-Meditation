package com.suw.suweimeditation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suw.suweimeditation.databinding.ActivityAboutBinding


class AboutActivity: AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            this.supportActionBar?.hide();
        }

        binding.btnToMenu.setOnClickListener {
            val intent = Intent(this, VolumeActivity::class.java)
            startActivity(intent)
        }

    }
}