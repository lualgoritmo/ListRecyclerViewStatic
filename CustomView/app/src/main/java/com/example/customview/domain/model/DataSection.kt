package com.example.customview.domain.model

import androidx.annotation.ColorInt

data class DataSection(
    val imgSection: Int,
    val titleSection: String,
    val valuePrimary: String,
    val valueSecundary: String,
    val textButton: String,
    val imgButton: Int,
    @ColorInt val colorSection: Int
)
