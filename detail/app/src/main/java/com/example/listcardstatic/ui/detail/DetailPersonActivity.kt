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
    private fun personDetailView() =  person?.run {
        binding.tvDetailName.text = name
        binding.tvDetailAge.text = age
        binding.imgDetail.setImageResource(imgPerson)
        binding.tvDetailGenere.text = detailGenere
        binding.tvTitleDescription.text = detailTextPerson
    }

}
