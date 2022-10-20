package com.suw.suweimeditation.model

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import com.suw.suweimeditation.R

@BindingAdapter("android:src")
fun bindImageView(view: ImageView, img:Int) {
    Picasso
        .get()
        .load(img)
        .fit()
        .centerCrop()
        .into(view)
}

fun listOfPhotos(): List<SlideAboutPhoto> {
    val slideAboutPhotos = mutableListOf<SlideAboutPhoto>()

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation1,
            SlideName(
                "Медитация — отличный способ от них избавиться и прервать замкнутый круг напряжённости.\n"
            ),
            "Тибет"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation2,
            SlideName(
                "Медитация — отличный способ от них избавиться и прервать замкнутый круг напряжённости.\n"
            ),
            "Бутан"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation3,
            SlideName(
                "Во время практик происходит полноценное расслабление организма, но в это же время в нём запускаются многие процессы, которые влияют на физическое и психическое состояния человека, а также сказываются на фигуре\n"
            ),
            "Непал"
        )
    )


    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation4,
            SlideName(
                "Медитация положительно влияет на мозг. Результаты многочисленных исследований доказали, что миндалевидное тело, которое отвечает за эмоциональные реакции, значительно сокращается в размерах в процессе практики. \n"
            ),
            "Непал"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation5,
            SlideName(
                "Медитация положительно влияет на мозг. Результаты многочисленных исследований доказали, что миндалевидное тело, которое отвечает за эмоциональные реакции, значительно сокращается в размерах в процессе практики. \n"
            ),
            "Катманду"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation6,
            SlideName(
                "Оздаравливают организм изнутри. Некоторые исследования показали, что у людей, которые уделяют медитации хотя бы 15 минут в день, повысился тонус блуждающего нерва, соединяющего сердце и мозг.\n"
            ),
            "Шиша Пангма"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation7,
            SlideName(
                "Помогают лучше чувствовать окружающих. Медитация — это не бесцельное созерцание абстрактной точки в пространстве. Во время практики внимание должно быть направлено внутрь вас самих. \n"
            ),
            "Лакхнау"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation8,
            SlideName(
                "Избавляют от острого ощущения боли. Так как практики влияют на мозговые процессы и психическое состояние, они учат самостоятельно генерировать положительные эмоции, а также избавляться или ослаблять негативные.\n"
            ),
            "Тхимпху"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.ic_medetation9,
            SlideName(
                "Помогают похудеть. Похудение непрерывно связано с метаболизмом. Стресс является огромным препятствием на пути к правильной работе организма, а постоянное нервное состояние способно привести к набору веса\n"
            ),
            "Гувахати"
        )
    )
    return slideAboutPhotos
}