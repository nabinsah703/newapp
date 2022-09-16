package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songList = findViewById<RecyclerView>(R.id.songList)

        val songObject : MutableList<Song> = mutableListOf<Song>()

        songObject.add(Song("RUBY","this is the backend progamming language"))
        songObject.add(Song("RUBY ON RAILS","this is the backend progamming language"))
        songObject.add(Song("DAYABASE","this is the backend progamming language"))
        songObject.add(Song("Python","this is the backend progamming language"))
        songObject.add(Song("Ruby","this is the backend progamming language"))
        songObject.add(Song("C#","this is the backend progamming language"))
        songObject.add(Song("Node Js","this is the backend progamming language"))
        songObject.add(Song("React Js","this is the backend progamming language"))
        songObject.add(Song("HTML","this is the backend progamming language"))
        songObject.add(Song("JAVASCRIPT","this is the backend progamming language"))
        songObject.add(Song("JAVA","this is the backend progamming language"))
        songObject.add(Song("PERL","this is the backend progamming language"))
        songObject.add(Song("Express JS","this is the backend progamming language"))

        songObject.add(Song("Python","this is the backend progamming language"))

        //val songs:List<String> = listOf("python","Array","Youtube","Ruby","python","Array","Youtube","Ruby","python","Array","Youtube","Ruby")
        songList.adapter = MyAdapter(songObject)
        songList.layoutManager = LinearLayoutManager(this)


    }
}