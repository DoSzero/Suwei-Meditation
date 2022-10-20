package com.suw.suweimeditation.util

import android.view.View
import androidx.core.view.ViewCompat
import androidx.viewpager2.widget.ViewPager2
import com.suw.suweimeditation.model.RationConstants.ALPHA_FACTOR
import com.suw.suweimeditation.model.RationConstants.DEFAULT_ALPHA
import com.suw.suweimeditation.model.RationConstants.DEFAULT_SCALE
import com.suw.suweimeditation.model.RationConstants.DEFAULT_TRANSLATION_FACTOR
import com.suw.suweimeditation.model.RationConstants.DEFAULT_TRANSLATION_X
import com.suw.suweimeditation.model.RationConstants.SCALE_FACTOR
import kotlin.math.abs

class TransformerUtil(private val offscreenPageLimit: Int) : ViewPager2.PageTransformer {

    override fun transformPage(page: View, position: Float) {
        page.apply {
            ViewCompat.setElevation(page, -abs(position))

            val scaleFactor = -SCALE_FACTOR * position + DEFAULT_SCALE
            val alphaFactor = -ALPHA_FACTOR * position + DEFAULT_ALPHA

            when {
                position <= 0f -> {
                    translationX = DEFAULT_TRANSLATION_X
                    scaleX = DEFAULT_SCALE
                    scaleY = DEFAULT_SCALE
                    alpha = DEFAULT_ALPHA + position
                }
                position <= offscreenPageLimit - 1 -> {
                    scaleX = scaleFactor
                    scaleY = scaleFactor
                    translationX = -(width / DEFAULT_TRANSLATION_FACTOR) * position
                    alpha = alphaFactor
                }
                else -> {
                    translationX = DEFAULT_TRANSLATION_X
                    scaleX = DEFAULT_SCALE
                    scaleY = DEFAULT_SCALE
                    alpha = DEFAULT_ALPHA
                }
            }
        }
    }
}