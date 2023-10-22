package com.example.recycleview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var myRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.rView)
        //зададим менеджер компоновки - как буду размещаться эелементы
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = MyAdapter(this,  fetchList())
    }

    fun fetchList(): ArrayList<ColorData> {
        val list = arrayListOf<ColorData>()
        list.add(ColorData("Blue", Color.BLUE))
        list.add(ColorData("Red", Color.RED))
        list.add(ColorData("Black", Color.BLACK))
        list.add(ColorData("Yellow", Color.YELLOW))
        list.add(ColorData("Green", Color.GREEN))
        list.add(ColorData("Magenta", Color.MAGENTA))
        list.add(ColorData("Blue", Color.BLUE))
        list.add(ColorData("Red", Color.RED))
        list.add(ColorData("Black", Color.BLACK))
        list.add(ColorData("Yellow", Color.YELLOW))
        list.add(ColorData("Green", Color.GREEN))
        list.add(ColorData("Magenta", Color.MAGENTA))

        return list
    }
}

data class ColorData(val colorName: String, val colorHex: Int)