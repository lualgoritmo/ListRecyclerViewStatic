package com.example.listcardstatic.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listcardstatic.databinding.PersonDetailBinding

class DetailPersonActivity : AppCompatActivity() {

    private val binding by lazy { PersonDetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}