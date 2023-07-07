package com.example.listcardstatic.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listcardstatic.databinding.PersonDetailBinding.inflate
import com.example.listcardstatic.domain.PersonTest
import com.example.listcardstatic.ui.util.PESSOA

class DetailPersonActivity : AppCompatActivity() {

    private val binding by lazy { inflate(layoutInflater) }
    private val person by lazy { intent?.getSerializableExtra(PESSOA) as? PersonTest}
    override fun onCreate(savedInstanceState: Bundle?) {
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
