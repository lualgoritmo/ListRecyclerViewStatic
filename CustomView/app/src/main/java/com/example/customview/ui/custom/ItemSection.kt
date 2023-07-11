package com.example.customview.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customview.databinding.ItemSectionBinding

class ItemSection @JvmOverloads constructor(
    @NonNull context: Context,
    @Nullable attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttrs) {
    private val binding = ItemSectionBinding.inflate(LayoutInflater.from(context))
}