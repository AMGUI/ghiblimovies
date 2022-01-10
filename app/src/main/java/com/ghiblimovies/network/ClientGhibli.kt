package com.ghiblimovies.network

import com.ghiblimovies.Movie
import retrofit2.Call
import retrofit2.http.GET

interface ClientGhibli {
    @GET("films")
    fun getDibre(): Call<List<Movie>>
}