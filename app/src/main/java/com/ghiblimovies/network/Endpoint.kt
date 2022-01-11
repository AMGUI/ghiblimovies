package com.ghiblimovies

import retrofit2.Call
import retrofit2.http.GET

const val URL = "https://ghibliapi.herokuapp.com"

interface Endpoint {
    @GET("films")
    fun getMovies() : Call<List<Movies>>
}