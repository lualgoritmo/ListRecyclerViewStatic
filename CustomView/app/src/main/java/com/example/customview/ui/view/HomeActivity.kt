package com.example.customview.ui.view

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.customview.R
import com.example.customview.databinding.ActivityHomeBinding
import com.example.customview.domain.model.DataHeader
import com.example.customview.domain.model.DataSection

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        val headerFor = DataHeader(
            imgDataLeft = R.drawable.fit,
            titleHeader = "Panela Velha é que Faz Comida Boa",
            imgDataRight = R.drawable.fritas,
            backColor = Color.parseColor("#FF00FF")
        )
        val itemSection: DataSection = DataSection(
            imgLeftSection = R.drawable.fit,
            titleMain = "Esse é o Texto Principal",
            valuePrimary = "$39.534",
            valueSecundary = "123",
            btnClick = clickHere,
            colorSection = Color.parseColor("#FF00FF")
        )
        binding.itemHeader.dataHeader = headerFor
        binding.itemSection.dataSection = itemSection

    }

    private val clickHere : () -> Unit = {
            val message = "Botão clicado!"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}
