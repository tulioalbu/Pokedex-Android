 package me.dio.pokedex_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.tulio.pokedex_android.domain.Pokemon
import me.tulio.pokedex_android.domain.PokemonType
import me.tulio.pokedex_android.view.PokemonAdapter

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val bulbasaur =      Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png",
            1,
            "Bulbasaur",
            listOf(
                PokemonType("Grass"),
                PokemonType("Poison")
            )
        )

        val pokemons = listOf(
            bulbasaur, bulbasaur, bulbasaur, bulbasaur, bulbasaur
        )

        val layoutManager = LinearLayoutManager (this)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
 }

