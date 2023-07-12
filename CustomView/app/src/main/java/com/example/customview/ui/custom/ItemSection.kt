package com.example.customview.ui.custom

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customview.R
import com.example.customview.databinding.ItemSectionBinding
import com.example.customview.domain.model.DataSection

class ItemSection @JvmOverloads constructor(
    @NonNull context: Context,
    @Nullable attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttrs) {

    private val binding: ItemSectionBinding = ItemSectionBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    var dataSection: DataSection = DataSection(
        imgLeftSection = R.drawable.zup,
        titleMain = String(),
        valuePrimary = String(),
        valueSecundary = String(),
        btnClick = {},
        colorSection = 0,
        isContent = false
    )
        set(value) {
            field = value

            binding.imvLeftSection.setImageResource(value.imgLeftSection)
            binding.tvTitleMain.text = value.titleMain
            binding.tvInformSection.text = value.valuePrimary
            binding.tvSubtitle.text = value.valueSecundary
            binding.btnButton.text = context.getString(R.string.btn_click)
            binding.btnButton.backgroundTintList = ColorStateList.valueOf(Color
                .parseColor("#00FF00"))
            binding.btnButton.setOnClickListener { dataSection.btnClick.invoke() }

            binding.root.background = GradientDrawable().apply {
                shape = GradientDrawable.RECTANGLE
                cornerRadius = 12.0f
                setColor(value.colorSection)
            }

        }

}
