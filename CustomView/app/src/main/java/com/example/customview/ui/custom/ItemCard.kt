package com.example.customview.ui.custom

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.cardview.widget.CardView
import com.example.customview.R
import com.example.customview.databinding.ItemCardBinding
import com.example.customview.domain.model.DataCard

class ItemCard @JvmOverloads constructor(
    @NonNull context: Context,
    @Nullable attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {
    private val binding by lazy {
        ItemCardBinding.inflate(
            LayoutInflater.from(context),
            this, true
        )
    }
    var card: DataCard = DataCard(
        cardImg = R.drawable.fit,
        tvTextMain = String(),
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

            setOf(tvTextSimple, tvRSimple).forEach { _ ->
                when (value.isContent) {
                    true -> R.style.TextStyleSimple
                    false -> R.style.TextStyleSimple
                }
            }

            imgCard.setImageResource(value.cardImg)
            tvTextMain.text = value.tvTextMain
            tvTextSimple.text = value.textSimple
            tvTextRegular.text = value.textRegular
            tvRSimple.text = value.textRsimple

           ctlItemCard.setBackgroundColor(value.colorCard)
        }
}
