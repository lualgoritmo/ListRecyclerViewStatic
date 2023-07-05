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

    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        val adapter = PersonAdapter { person ->
            Toast.makeText(this, "Clicou na pessoa ${person.name}", Toast.LENGTH_SHORT).show()
        }

        binding.rcvListPerson.adapter = adapter
        adapter.updatePerson(person())
        binding.rcvListPerson.layoutManager = LinearLayoutManager(
            this@HomeActivity,
            LinearLayoutManager.VERTICAL,
            true
        )
    }

    private fun person(): MutableList<PersonTest> = mutableListOf(
        PersonTest(
            name = "Luci Meneive Silva",
            age = "41",
            imgPerson = R.drawable.fit,
            description = "Vamos viver, vender, sorrir, buscar"
        ),
        PersonTest(
            name = "Mariana Ferreira Silva",
            age = "41",
            imgPerson = R.drawable.barracao,
            description = "Vamos viver, vender, sorrir, buscar"
        ),
        PersonTest(
            name = "Santina Fresca Silva",
            age = "52",
            imgPerson = R.drawable.fritas,
            description = " Aoh, dia dia dia dia dia dia dia"
        ),
        PersonTest(
            name = "Luciano Garcia do Nascimento",
            age = "41",
            imgPerson = R.drawable.maritur,
            description = "Vamos viver, vender, sorrir, buscar"
        ),
        PersonTest(
            name = "Mariana Ferreira Silva",
            age = "41",
            imgPerson = R.drawable.rastro,
            description = "Vamos viver, vender, sorrir, buscar"
        ),
        PersonTest(
            name = "Santina Fresca Silva",
            age = "52",
            imgPerson = R.drawable.zup,
            description = " Aoh, dia dia dia dia dia dia dia"
        )
    )
}