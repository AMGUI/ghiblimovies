package com.ghiblimovies

import MovieAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler : RecyclerView
    lateinit var nadapter : MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista : ArrayList<Movie> = ArrayList()
        var testTags: ArrayList<String> = ArrayList<String>()
        testTags.add("9238da")

        recycler = findViewById(R.id.movieRecycler)

        lista.add(Movie(210, "test movie", testTags, "blablabla"))

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