package com.example.listcardstatic.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listcardstatic.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}
