package com.example.customview.ui.custom

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
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
            binding.btnButton.setOnClickListener(clickHere)

            val shapeDrawable = GradientDrawable()
            shapeDrawable.shape = GradientDrawable.RECTANGLE
            shapeDrawable.cornerRadius = 12.0f
            shapeDrawable.setColor(value.colorSection)
            binding.root.background = shapeDrawable
        }

    private val clickHere: OnClickListener = OnClickListener {
        dataSection.btnClick.invoke()
    }
}
