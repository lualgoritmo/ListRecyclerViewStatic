package com.example.customview.ui.view

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customview.R
import com.example.customview.databinding.ActivityHomeBinding.inflate
import com.example.customview.domain.model.DataHeader

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }
    private fun initView() {
        val dataHeader = DataHeader(
            imgDataLeft = R.drawable.ic_launcher_background,
            titleHeader = "Azul da cor do mar",
            imgDataRight = R.drawable.ic_launcher_background,
            backColor = Color.parseColor("#FF00FF")
        )

        val headerSecond = DataHeader(
            imgDataLeft = R.drawable.barracao,
            titleHeader = "Azul da cor do mar",
            imgDataRight = R.drawable.rastro,
            backColor = Color.parseColor("#CC00FF")
        )

        val headerTree = DataHeader(
            imgDataLeft = R.drawable.barracao,
            titleHeader = "Aonde foi que não fui",
            imgDataRight = R.drawable.fritas,
            backColor = Color.parseColor("#000080")
        )

        val headerFor = DataHeader(
            imgDataLeft = R.drawable.maritur,
            titleHeader = "Panela Velha é que Faz Comida Boa",
            imgDataRight = R.drawable.fritas,
            backColor = Color.parseColor("#4169E1")
        )

        binding.navHeaderTest.dataHeader = dataHeader
        binding.headerSecond.dataHeader = headerSecond
        binding.headerTree.dataHeader = headerTree
        binding.headerFor.dataHeader = headerFor
    }

}
