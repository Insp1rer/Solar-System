package com.example.solar_system

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.solar_system.databinding.MainElementBinding

class PlanetsAdapter() :
    RecyclerView.Adapter<PlanetsAdapter.PlanetsHolder>() {
    private val planets = ArrayList<PlanetData>()
    class PlanetsHolder(view: View):RecyclerView.ViewHolder(view){
        val binding = MainElementBinding.bind(view)
        fun bind(planet: PlanetData){
            binding.apply {
                planetName.text = planet.name
                planetDescription.text = planet.description
                //planetTemperature.text = planet.temperature
                //planetDistance.text = planet.distance
                //
            }
        }
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.main_element, parent, false)
            return PlanetsHolder(itemView)
        }

    override fun onBindViewHolder(holder: PlanetsAdapter.PlanetsHolder, position: Int) {
        holder.bind(planets[position])
    }

    override fun getItemCount(): Int {
        return planets.size
    }
 fun addPlanet(newList: List<PlanetData>){
     planets.clear()
     planets.addAll(newList)
     notifyDataSetChanged()
 }
}
