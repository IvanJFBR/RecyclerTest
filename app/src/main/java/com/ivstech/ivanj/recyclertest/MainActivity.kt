package com.ivstech.ivanj.recyclertest

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val carros: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addCarros()

        rv_carro_list.layoutManager = LinearLayoutManager(this)

        rv_carro_list.adapter = AnimalAdapter(carros, this)
    }

    private fun addCarros() {
        carros.add("Fusion")
        carros.add("Gol")
        carros.add("Onix")
        carros.add("Monza")
        carros.add("Renegade")
        carros.add("Compass")
        carros.add("Siena")
        carros.add("Fiat Uno")
        carros.add("Palio")
        carros.add("Cheetah")
        carros.add("Inferno")
        carros.add("Gran Siena")
        carros.add("Fusca")
        carros.add("New Beattle")
        carros.add("Ford KA")
        carros.add("EcoSport")
        carros.add("Fiesta")
        carros.add("Supra")
        carros.add("Corola")
        carros.add("Audi A3")
        carros.add("Audi A4")
        carros.add("Audi TT")
        carros.add("HB20")
        carros.add("Veloster")
        carros.add("I30")
        carros.add("Tucson")
        carros.add("Honda Civic")
        carros.add("New Civic")
        carros.add("Honda City")
        carros.add("Peugeot 206")
        carros.add("Peugeot 207")
        carros.add("Golf GTI")
    }
}
