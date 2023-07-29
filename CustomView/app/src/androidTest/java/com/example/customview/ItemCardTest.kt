package com.example.customview

import android.content.Context
import android.graphics.Color
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.customview.domain.model.DataCard
import com.example.customview.ui.custom.ItemCard
import com.example.customview.ui.view.HomeActivity
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ItemCardTest {
    private lateinit var customCard: ItemCard
    private lateinit var context: Context

    @Before
    fun init() {
        context = ApplicationProvider.getApplicationContext()
        customCard = ItemCard(context)
        customCard.card = DataCard(
            cardImg = R.drawable.fit,
            tvTextMain = "Primeiro",
            textSimple = "Simples Primeiro",
            textRegular = "Texto Regular",
            textRsimple = "Texto Regular Simples",
            colorCard = Color.parseColor("#F0F8FF"),
            colorStroke = R.color.red_color,
            isContent = false
        )

        val activityScenario = ActivityScenario.launch(HomeActivity::class.java)
        activityScenario.onActivity { activity ->
            activity.setContentView(customCard)
        }
    }

    @Test
    fun initView() {
        assertEquals(R.drawable.fit, customCard.card.cardImg)
        assertEquals("Primeiro", customCard.card.tvTextMain)
        assertEquals("Simples Primeiro", customCard.card.textSimple)
        assertEquals("Texto Regular", customCard.card.textRegular)
        assertEquals("Texto Regular Simples", customCard.card.textRsimple)
        assertEquals(Color.parseColor("#F0F8FF"), customCard.card.colorCard)
        assertEquals(R.color.red_color, customCard.card.colorStroke)
        assertFalse(customCard.card.isContent)
    }


}
