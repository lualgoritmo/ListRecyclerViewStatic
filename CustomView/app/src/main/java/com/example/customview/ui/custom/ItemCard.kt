package com.example.customview.ui.custom

import android.content.Context
import android.graphics.Paint.Style
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customview.R
import com.example.customview.databinding.ItemCardBinding
import com.example.customview.domain.model.DataCard

class ItemCard @JvmOverloads constructor(
    @NonNull context: Context,
    @Nullable attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private val binding by lazy {
        ItemCardBinding.inflate(
            LayoutInflater.from(context),
            this, true
        )
    }

    var card: DataCard = DataCard(
        cardImg = R.drawable.fit,
        textBold = String(),
        textSimple = String(),
        textRegular = String(),
        textRsimple = String(),
        colorCard = 0,
        isContent = false
    )
        set(value) = with(binding) {
            field = value
            setOf(tvTextMain, tvTextRegular).forEach { _ ->
                when (value.isContent) {
                    true -> R.style.TextStyleMainNot
                    false -> R.style.TextStyleMainNot
                }
            }
            setOf(tvTextSecond, tvRSimple).forEach { _ ->
                when (value.isContent) {
                    true -> R.style.TextStyleSimple
                    false -> R.style.TextStyleSimple
                }
            }
        }
}