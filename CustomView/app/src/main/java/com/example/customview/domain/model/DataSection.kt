package com.example.customview.domain.model

import androidx.annotation.ColorInt

data class DataSection(
    val imgLeftSection: Int,
    val titleMain: String,
    val valuePrimary: String,
    val valueSecundary: String,
    val btnClick: () -> Unit,
    @ColorInt val colorSection: Int,
    val isContent: Boolean = false
)
