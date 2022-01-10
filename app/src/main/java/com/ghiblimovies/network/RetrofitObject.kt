package com.ghiblimovies.network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val  BASE_URL = "https://ghibliapi.herokuapp.com"

object RetrofitObject {

    private fun retrofitClient(): Retrofit {
        return Retrofit.Builder().
        baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }

    fun obterEndPoit(): ClientGhibli {
        val client  = retrofitClient()

        return client.create(ClientGhibli::class.java)

    }

}

