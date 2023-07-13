package com.example.listcardstatic.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listcardstatic.databinding.ItemPersonBinding
import com.example.listcardstatic.domain.PersonTest

class PersonAdapter(private val onClick: (personTest: PersonTest) -> Unit) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    private var listPerson: MutableList<PersonTest> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val binding = ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonViewHolder(binding)
    }

    override fun getItemCount(): Int = listPerson.size

    fun updatePerson(newListPerson: MutableList<PersonTest>) {
        listPerson = newListPerson
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = listPerson[position]
        holder.bind(person)
        holder.itemView.setOnClickListener {
            onClick(person)
        }
    }

    inner class PersonViewHolder(private val binding: ItemPersonBinding) :
        RecyclerView.ViewHolder(binding.root) { fun bind(person: PersonTest)
        = binding.apply {
            tvNamePerson.text = person.name
            edtAgePerson.text = person.age
            imgPerson.setImageResource(person.imgPerson)
            tvDescription.text = person.description
        }
    }
}
