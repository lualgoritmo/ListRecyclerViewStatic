package com.example.listrcvlayout.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listrcvlayout.databinding.ItemRcvBinding
import com.example.listrcvlayout.domain.model.Card

class CardPersonAdapter : RecyclerView.Adapter<CardPersonAdapter.CardViewHolder>() {

    private var listItem: MutableList<Card> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CardViewHolder(
        binding = ItemRcvBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val card = listItem[position]
        holder.bind(card)
    }

    override fun getItemCount(): Int = listItem.size

    fun updateCard(newCard: MutableList<Card>) {
        listItem = newCard
        notifyDataSetChanged()
    }

    inner class CardViewHolder(private val binding: ItemRcvBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(card: Card) = binding?.run {
            imgItem.setImageResource(card.imgItem)
            tvItemTitle.text = card.tvTitle
        }

    }

}
