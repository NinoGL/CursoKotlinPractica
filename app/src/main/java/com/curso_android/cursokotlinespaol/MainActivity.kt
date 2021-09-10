package com.curso_android.cursokotlinespaol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler)

        val layoutManager = GridLayoutManager(this,3)

        recycler.layoutManager = layoutManager

        recycler.adapter = MoviesAdapter(listOf(
            Movie("Gato 1", "https://loremflickr.com/320/240?lock=1"),
            Movie("Gato 2", "https://loremflickr.com/320/240?lock=2"),
            Movie("Gato 3", "https://loremflickr.com/320/240?lock=3"),
            Movie("Gato 4", "https://loremflickr.com/320/240?lock=4"),
            Movie("Gato 5", "https://loremflickr.com/320/240?lock=5"),
            Movie("Gato 6", "https://loremflickr.com/320/240?lock=6"),
            Movie("Gato 7", "https://loremflickr.com/320/240?lock=7"),
            Movie("Gato 8", "https://loremflickr.com/320/240?lock=8"),
            Movie("Gato 9", "https://loremflickr.com/320/240?lock=9"),
        ))

        //val movie = findViewById<MovieView>(R.id.movie)
        //movie.setMovie(Movie("Batman", "https://"))

    }








    override fun onStart() {
        Log.d(tag,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag,"onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag,"onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag,"onDestroy")
        super.onDestroy()
    }

}