package com.example.listrcvlayout.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listrcvlayout.R
import com.example.listrcvlayout.databinding.ActivityMainBinding.inflate
import com.example.listrcvlayout.domain.model.Card
import com.example.listrcvlayout.ui.adapter.CardPersonAdapter

class MainActivity : AppCompatActivity() {
    private val binding by lazy { inflate(layoutInflater) }
    private val adapter by lazy { CardPersonAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        mainInit()
    }

    private fun mainInit() = binding?.run {
        imgTitle.setImageResource(R.drawable.ic_launcher_foreground)
        tvTitleInit.text = "Esse é o Texto Principal"
        tvTitleSecond.text = "Esse é o Segundo Texto Principal"
        viewInit()
    }

    private fun viewInit() = binding.apply {
        rcvList.adapter = adapter
        adapter.updateCard(card())
        rcvList.layoutManager = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.VERTICAL,
            true
        )
    }

    private fun card(): MutableList<Card> = mutableListOf(
        Card(
            imgItem = R.mipmap.ic_launcher_round,
            tvTitle = "Esse é o texto do Item Um"
        ),
        Card(
            imgItem = R.mipmap.ic_launcher_round,
            tvTitle = "Esse é o texto do Item Dois"
        ),
        Card(
            imgItem = R.mipmap.ic_launcher_round,
            tvTitle = "Esse é o texto do Item Três"
        ),
        Card(
            imgItem = R.mipmap.ic_launcher_round,
            tvTitle = "Esse é o texto do Item Três"
        )
    )

}
