package com.example.solar_system

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.solar_system.databinding.FragmentSolarBinding

class SolarFragment : Fragment(R.layout.fragment_solar) {
private lateinit var binding: FragmentSolarBinding
private val adapterPlanet = PlanetsAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSolarBinding.bind(view)
        adapterPlanet.addPlanet(resycleElements())
        binding.myRecycler.adapter = adapterPlanet
        binding.myRecycler.layoutManager = LinearLayoutManager(context)
    }
    fun resycleElements() : List<PlanetData> {
        return listOf(
        PlanetData("Меркурій", "500 мільйонів км", "fotka", "Маленький гном", "900 C"))
    }
}