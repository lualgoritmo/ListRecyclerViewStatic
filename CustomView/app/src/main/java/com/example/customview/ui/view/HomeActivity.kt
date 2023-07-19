package com.example.customview.ui.view

import DataCardAdapter
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customview.R
import com.example.customview.databinding.ActivityHomeBinding
import com.example.customview.domain.model.DataCard
import com.example.customview.domain.model.DataHeader
import com.example.customview.domain.model.DataSection

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }
    private val adapter by lazy { DataCardAdapter(::onClick) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        initRcv()
    }

    private fun initView() {
        val headerFor = DataHeader(
            imgDataLeft = R.drawable.fit,
            titleHeader = "Panela Velha é que Faz Comida Boa",
            imgDataRight = R.drawable.fritas,
            backColor = Color.parseColor("#F0F8FF")
        )
        val itemSection: DataSection = DataSection(
            imgLeftSection = R.drawable.fit,
            titleMain = "Esse é o Texto Principal",
            valuePrimary = "$39.534",
            valueSecundary = "123",
            btnClick = clickHere,
            colorSection = Color.parseColor("#F0F8FF")
        )
        val itemCard = DataCard(
            cardImg = R.drawable.fit,
            tvTextMain = "Primeiro",
            textSimple = "Simples Primeiro",
            textRegular = "Texto Regular",
            textRsimple = "Texto Regular Simples",
            colorCard = Color.parseColor("#F0F8FF"),
            isContent = false
        )

        binding.itemHeader.dataHeader = headerFor
        binding.itemSection.dataSection = itemSection
        binding.ctmItemCard.card = itemCard

    }

    private val clickHere: () -> Unit = {
        val message = "Botão clicado!"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    private fun initRcv() = binding.run {
        rcvItemCard.adapter = adapter
        adapter.updateCard(itemListCard())
        rcvItemCard.layoutManager = LinearLayoutManager(this@HomeActivity)
    }
    private fun itemListCard() = mutableListOf(
        DataCard(
            cardImg = R.drawable.fit,
            tvTextMain = "Esse aqui mesmo",
            textSimple = "Foi eu",
            textRegular = "Texto Regular",
            textRsimple = "Texto Simples",
            colorCard = Color.parseColor("#F0F8FF"),
            isContent = false
        ),
        DataCard(
            cardImg = R.drawable.maritur,
            tvTextMain = "Esse Segundo",
            textSimple = "Foi eu",
            textRegular = "Texto Regular",
            textRsimple = "Texto Simples",
            colorCard = Color.parseColor("#F0F8FF"),
            isContent = false
        ),
        DataCard(
            cardImg = R.drawable.fritas,
            tvTextMain = "Esse Terceiro",
            textSimple = "Foi eu",
            textRegular = "Texto Regular",
            textRsimple = "Texto Simples",
            colorCard = Color.parseColor("#F0F8FF"),
            isContent = false
        )
    )

    private fun onClick(dataCard: DataCard) = Toast.makeText(this,
        "Botão clickado, ${ dataCard.tvTextMain }", Toast.LENGTH_SHORT).show()

}
