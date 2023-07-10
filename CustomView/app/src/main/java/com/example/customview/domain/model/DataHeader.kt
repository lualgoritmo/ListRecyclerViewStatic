package com.example.customview.domain.model

import androidx.annotation.ColorInt

data class DataHeader(
    val imgDataLeft: Int,
    val titleHeader: String,
    val imgDataRight: Int,
    @ColorInt val backColor: Int,
)
