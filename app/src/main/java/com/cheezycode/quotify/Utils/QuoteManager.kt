package com.cheezycode.quotify.Utils

import android.content.Context
import com.cheezycode.quotify.Quote
import com.google.gson.Gson

class QuoteManager {
    var quoteList = emptyArray<Quote>()
    private var currentQuoteIndex = 0

    fun loadQuoteFromAssets(context: Context, fileName: String) {
        val inputStream = context.assets.open(fileName)
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        quoteList = gson.fromJson(json, Array<Quote>::class.java)
    }

    fun loadQuotes(quotes: Array<Quote>) {
        quoteList = quotes
    }

    fun getQuote() = quoteList[currentQuoteIndex]

    fun nextQuote() = quoteList[++currentQuoteIndex % quoteList.size]

    fun previousQuote() = quoteList[(--currentQuoteIndex + quoteList.size) % quoteList.size]
}