package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var instrumentList : ArrayList<Instrument>
    private lateinit var instrumentAdapter : InstrumentAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        instrumentList = ArrayList()
        instrumentAdapter = InstrumentAdapter(instrumentList)
        instrumentListItems()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = instrumentAdapter
    }

    private fun instrumentListItems(){
        instrumentList.add(Instrument(R.drawable.guitar,"Guitar"))
        instrumentList.add(Instrument(R.drawable.bass_guitar,"Bass Guitar"))
        instrumentList.add(Instrument(R.drawable.electric_guitar,"Electric Guitar"))
        instrumentList.add(Instrument(R.drawable.piano,"Piano"))
        instrumentList.add(Instrument(R.drawable.violin,"Violin"))
        instrumentList.add(Instrument(R.drawable.drums,"Drums"))
        instrumentList.add(Instrument(R.drawable.accordion,"Accordion"))
        instrumentList.add(Instrument(R.drawable.dombra,"Dombra"))
        instrumentList.add(Instrument(R.drawable.saxaphone,"Sax"))
        instrumentList.add(Instrument(R.drawable.marakas,"Marakas"))
        instrumentList.add(Instrument(R.drawable.harp,"Harp"))
        instrumentList.add(Instrument(R.drawable.flute,"Flute"))
        instrumentList.add(Instrument(R.drawable.trumpet,"Trumpet"))
    }
}