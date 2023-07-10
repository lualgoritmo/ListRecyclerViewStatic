package com.example.customview.ui.custom

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customview.R
import com.example.customview.databinding.ItemHeaderMainBinding
import com.example.customview.domain.model.DataHeader

class HeaderItem @JvmOverloads constructor(
    @NonNull context: Context,
    @Nullable attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding by lazy { val inflater = LayoutInflater.from(context)
        ItemHeaderMainBinding.inflate(inflater, this, true)
    }
    val shape = GradientDrawable()

    var dataHeader: DataHeader = DataHeader(
        imgDataLeft = R.drawable.ic_launcher_foreground,
        titleHeader = String(),
        imgDataRight = R.drawable.ic_launcher_background,
        backColor = 0
    )
        set(value) = with(binding) {
            field = value

            imvImgLeft.setImageResource(value.imgDataLeft)
            tvTitle.text = value.titleHeader
            imvImgRight.setImageResource(value.imgDataRight)
            setBackgroundColor(value.backColor)

            val shapeDrawable = GradientDrawable()
            shapeDrawable.shape = GradientDrawable.RECTANGLE
            shapeDrawable.cornerRadius = 12.0f
            shapeDrawable.setStroke(6, Color.BLUE)
            shapeDrawable.setColor(value.backColor)
            background = shapeDrawable
        }

}
