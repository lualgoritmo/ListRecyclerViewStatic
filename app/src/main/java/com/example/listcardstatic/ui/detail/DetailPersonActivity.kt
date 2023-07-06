package com.example.listcardstatic.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listcardstatic.databinding.PersonDetailBinding.inflate
import com.example.listcardstatic.domain.PersonTest

class DetailPersonActivity : AppCompatActivity() {

    private val binding by lazy { inflate(layoutInflater) }
    private var person: PersonTest? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        person = intent?.getSerializableExtra("PESSOA") as? PersonTest
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
            personDetailView()

    }

    private fun personDetailView() =  person?.let {
        binding.tvDetailName.text = it.name
        binding.tvDetailAge.text = it.age
        binding.imgDetail.setImageResource(it.imgPerson)
        binding.tvDetailGenere.text = it.detailGenere
        binding.tvTitleDescription.text = it.detailTextPerson
    }

}