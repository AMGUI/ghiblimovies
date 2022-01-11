package com.ghiblimovies

import MovieAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var recycler : RecyclerView
    lateinit var nadapter : MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.movieRecycler)

        getData()
    }

    fun showAdapter(lista : List<Movies>) {
        nadapter = MovieAdapter(lista)

        recycler.apply {
            layoutManager = GridLayoutManager(context, 1)
            adapter = nadapter
            hasFixedSize()
        }
    }

    fun getData() {
        val retrofitClient = NetworkUtils
            .getRetrofitInstance(URL)

        val endpoint = retrofitClient.create(Endpoint::class.java)
        val callback = endpoint.getMovies()

        callback.enqueue(object : Callback<List<Movies>> {
            override fun onFailure(call: Call<List<Movies>>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<Movies>>, response: Response<List<Movies>>) {
               showAdapter(response.body()!!)
            }
        })

    }
}