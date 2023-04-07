package com.example.solar_system

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.solar_system.databinding.MainElementBinding

class PlanetsAdapter(val startDefinitionFragment: (PlanetData) -> Unit) :
    RecyclerView.Adapter<PlanetsAdapter.PlanetsHolder>() {
    private val planets = ArrayList<PlanetData>()

    inner class PlanetsHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = MainElementBinding.bind(view)
        fun bind(planet: PlanetData) {
            binding.planetName.text = planet.name
            binding.planetDescription.text = planet.description

            Glide
                .with(binding.root)
                .load(planet.image)
                .into(binding.planetImage)

            binding.card1.setOnClickListener{
                startDefinitionFragment(planets[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_element, parent, false)
        return PlanetsHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlanetsHolder, position: Int) {
        holder.bind(planets[position])
    }

    override fun getItemCount(): Int {
        return planets.size
    }

    fun addPlanet(newList: List<PlanetData>) {
        planets.clear()
        planets.addAll(newList)
        notifyDataSetChanged()
    }
}