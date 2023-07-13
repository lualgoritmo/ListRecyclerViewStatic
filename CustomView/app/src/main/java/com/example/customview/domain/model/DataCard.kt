package com.example.customview.domain.model

import androidx.annotation.ColorInt

class DataCard(
    val cardImg: Int,
    val tvTextMain: String,
    val textSimple: String,
    val textRegular: String,
    val textRsimple: String,
    @ColorInt val colorCard: Int,
    val isContent: Boolean = false
)