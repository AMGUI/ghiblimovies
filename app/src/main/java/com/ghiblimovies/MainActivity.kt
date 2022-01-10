package com.ghiblimovies

import MovieAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler : RecyclerView
    lateinit var nadapter : MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista : ArrayList<Movie> = ArrayList()

        // Delete after API is implemented
        var testTags: ArrayList<String> = ArrayList<String>()
        testTags.add("9238da")

        var test_icon: ImageView
        // Delete after API is implemented

        recycler = findViewById(R.id.movieRecycler)

        for(i in 0..10) {
            lista.add(Movie(210, "test movie", testTags, "blablabla"))
        }

        showAdapter(lista)
    }

    fun showAdapter(lista : ArrayList<Movie>) {
        nadapter = MovieAdapter(lista)

        recycler.apply {
            layoutManager = GridLayoutManager(context, 1)
            adapter = nadapter
            hasFixedSize()
        }
    }



}