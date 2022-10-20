package com.suw.suweimeditation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.suw.suweimeditation.databinding.ActivityVolumeBinding
import com.suw.suweimeditation.util.DialogsUtils

class VolumeActivity : AppCompatActivity(),
    DialogsUtils.YesDialogListener,
    DialogsUtils.NoDialogListener   {

    private lateinit var binding: ActivityVolumeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVolumeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            this.supportActionBar?.hide();
        }

        binding.btnWithVolume.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnWithoutVolume.setOnClickListener {
            openDialog()
        }

    }

    private fun openDialog() {
        DialogsUtils().show(supportFragmentManager,"Dialog")
    }

    override fun onYesClicked() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }

    override fun onNoClicked() {
     // Nothing to do just stay in Volume
    }

}