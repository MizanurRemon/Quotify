package com.cheezycode.quotify.Utils

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.FileNotFoundException
import java.io.NotActiveException

class QuoteManagerTest {

    private var context = ApplicationProvider.getApplicationContext<Context>()
    private var quoteManager = QuoteManager()
//    @Before
//    fun setUp() {
//    }
//
//    @After
//    fun tearDown() {
//    }

    @Test()
    fun loadQuoteFromAssets() {
        quoteManager.loadQuoteFromAssets(context, "quotes.json")
    }

    @Test(expected = Exception::class)
    fun loadQuoteFromAssetsWithException() {
        quoteManager.loadQuoteFromAssets(context, "banglaquotes.json")
    }

    @Test
    fun quotesCountTest() {
        quoteManager.loadQuoteFromAssets(context, "quotes.json")
        assertEquals(1643, quoteManager.quoteList.size)
    }
}