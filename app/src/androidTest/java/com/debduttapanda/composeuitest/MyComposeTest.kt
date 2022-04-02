package com.debduttapanda.composeuitest

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.debduttapanda.composeuitest.ui.theme.ComposeUiTestTheme
import org.junit.Rule
import org.junit.Test

class MyComposeTest {

    @get:Rule
    val composeTestRule = createComposeRule()
    // use createAndroidComposeRule<YourActivity>() if you need access to
    // an activity

    @Test
    fun MyTest() {
        // Start the app
        composeTestRule.setContent {
            UiContent()
        }

        composeTestRule.onNodeWithText("Show").performClick()

        composeTestRule.onNodeWithText("Visible").assertIsDisplayed()
    }
}