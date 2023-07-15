package com.example.customview.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customview.databinding.ItemCardBinding
import com.example.customview.domain.model.DataCard

class DataCardAdapter(private val onClick: (DataCard) -> Unit) :
    RecyclerView.Adapter<DataCardAdapter.DataCardViewHolder>() {

    private var listCard: MutableList<DataCard> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataCardViewHolder(
        binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = listCard.size

    override fun onBindViewHolder(holder: DataCardViewHolder, position: Int) {
        val cardList = listCard[position]
        holder.bind(cardList)
        holder.itemView.setOnClickListener { onClick(cardList) }
    }

    fun updateCard(newList: MutableList<DataCard>) {
        listCard = newList
        notifyDataSetChanged()
    }

    inner class DataCardViewHolder(private val binding: ItemCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(dataCard: DataCard) = binding?.run {
            imgCard.setImageResource(dataCard.cardImg)
            tvTextMain.text = dataCard.tvTextMain
            tvTextSimple.text = dataCard.textSimple
            tvTextRegular.text = dataCard.textRegular
            tvRSimple.text = dataCard.textRsimple
            ctlItemCard.setBackgroundColor(dataCard.colorCard)
        }
    }
}
