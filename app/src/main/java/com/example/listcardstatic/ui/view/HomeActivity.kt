package com.example.listcardstatic.ui.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listcardstatic.R
import com.example.listcardstatic.databinding.ActivityHomeBinding
import com.example.listcardstatic.domain.PersonTest
import com.example.listcardstatic.ui.adapter.PersonAdapter

class HomeActivity : AppCompatActivity() {
    private val person: List<PersonTest> = listOf(
        PersonTest(
            name = "Luciano Garcia do Nascimento",
            age = "41",
            imgPerson = R.drawable.ic_launcher_foreground,
            description = "Vamos viver, vender, sorrir, buscar"
        )
    )

    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        val adapter = PersonAdapter(person) { person ->
            Toast.makeText(this, "Clicou no produto ${person.name}", Toast.LENGTH_SHORT).show()
        }
        binding.rcvListPerson.adapter = adapter
        binding.rcvListPerson.layoutManager = LinearLayoutManager(this@HomeActivity)
    }
}
