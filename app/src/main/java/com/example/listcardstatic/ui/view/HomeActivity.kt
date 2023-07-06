package com.example.listcardstatic.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listcardstatic.R
import com.example.listcardstatic.databinding.ActivityHomeBinding.inflate
import com.example.listcardstatic.domain.PersonTest
import com.example.listcardstatic.ui.adapter.PersonAdapter
import com.example.listcardstatic.ui.detail.DetailPersonActivity

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        val adapter = PersonAdapter { detailPerson ->
            personDetail(detailPerson)

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
            age = "1550000",
            imgPerson = R.drawable.fit,
            description = "Vamos viver, vender, sorrir, buscar",
            detailGenere = "Feminino",
            detailTextPerson = getString(R.string.tv_text_example)
        ),
        PersonTest(
            name = "Mariana Ferreira Silva",
            age = "41",
            imgPerson = R.drawable.barracao,
            description = "Vamos viver, vender, sorrir, buscar",
            detailGenere = "Feminino",
            detailTextPerson = getString(R.string.tv_text_example)
        ),
        PersonTest(
            name = "Santina Fresca Silva",
            age = "52",
            imgPerson = R.drawable.fritas,
            description = " Aoh, dia dia dia dia dia dia dia",
            detailGenere = "Feminino",
            detailTextPerson = getString(R.string.tv_text_example)
        ),
        PersonTest(
            name = "Luciano Garcia do Nascimento",
            age = "39",
            imgPerson = R.drawable.maritur,
            description = "Vamos viver, vender, sorrir, buscar",
            detailGenere = "Masculino",
            detailTextPerson = getString(R.string.tv_text_example)
        ),
        PersonTest(
            name = "Mariana Ferreira Silva",
            age = "3000",
            imgPerson = R.drawable.rastro,
            description = "Vamos viver, vender, sorrir, buscar",
            detailGenere = "Feminino",
            detailTextPerson = getString(R.string.tv_text_example)
        ),
        PersonTest(
            name = "Simetria Foz de Iguaçu",
            age = "52",
            imgPerson = R.drawable.zup,
            description = " Aoh, dia dia dia dia dia dia dia",
            detailGenere = "Feminino",
            detailTextPerson = getString(R.string.tv_text_example)
        ),
        PersonTest(
            name = "Ferreiro Rocher Lide Campos",
            age = "41",
            imgPerson = R.drawable.fit,
            description = "Vamos viver, vender, sorrir, buscar",
            detailGenere = "Masculino",
            detailTextPerson = getString(R.string.tv_text_example)
        ),
        PersonTest(
            name = "Armani Candi da Silva",
            age = "602",
            imgPerson = R.drawable.barracao,
            description = "Vamos viver, vender, sorrir, buscar",
            detailGenere = "Masculino",
            detailTextPerson = getString(R.string.tv_text_example)
        ),
        PersonTest(
            name = "Livriero da Silva Costa",
            age = "2000",
            imgPerson = R.drawable.fritas,
            description = " Aoh, dia dia dia dia dia dia dia",
            detailGenere = "Masculino",
            detailTextPerson = getString(R.string.tv_text_example)
        )
    )
    private fun personDetail(person: PersonTest) {
        Intent(this@HomeActivity, DetailPersonActivity::class.java)
            .apply { putExtra("PESSOA", person) }.run(::startActivity)
    }
}
