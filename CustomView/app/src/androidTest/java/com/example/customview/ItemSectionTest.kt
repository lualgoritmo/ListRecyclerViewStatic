import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.customview.ui.view.HomeActivity
import org.junit.Rule
import org.junit.Test
import com.example.customview.R
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ItemSectionTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun initSection() {
        onView(withText("Esse é o Texto Principal"))
            .check(matches(isDisplayed()))
        onView(withText("$39.534"))
            .check(matches(isDisplayed()))
        onView(withText("123"))
            .check(matches(isDisplayed()))
    }

    @Test
    fun clickButton() {
        onView(withId(R.id.btn_button)).apply {
            check(matches(isDisplayed()))
            perform(click())
        }
    }
}
