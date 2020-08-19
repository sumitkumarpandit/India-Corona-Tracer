package com.myProject.indiacoronatracer
import okhttp3.Request
import okhttp3.OkHttpClient
object Client {
    private val okHttpClient = OkHttpClient()
    private val request = Request.Builder()
        .url("https://api.covid19india.org/data.json").build()
    val api = okHttpClient.newCall(request)
}