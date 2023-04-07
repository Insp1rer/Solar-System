package com.example.solar_system

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.solar_system.databinding.FragmentSolarBinding

class SolarFragment : Fragment(R.layout.fragment_solar) {
    private lateinit var binding: FragmentSolarBinding
    private val adapterPlanet = PlanetsAdapter(::startDefinitionFragment)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSolarBinding.bind(view)
        adapterPlanet.addPlanet(resycleElements())
        binding.myRecycler.adapter = adapterPlanet
        binding.myRecycler.layoutManager = LinearLayoutManager(context)
    }
    fun resycleElements() : List<PlanetData> {
        return listOf(
            PlanetData("Меркурій", "від 77,3 до 221,9 млн км", "https://www.pngplay.com/wp-content/uploads/13/Mercury-Transparent-File.png", getString(R.string.mercury_descr)),
        PlanetData("Венера", "38 млн. км до 258 млн. км", "https://www.pngplay.com/wp-content/uploads/13/Venus-Download-Free-PNG.png", getString(R.string.venus_descr)),
        PlanetData("Земля", "Ви зараз тут", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Earth_Western_Hemisphere_transparent_background.png/1024px-Earth_Western_Hemisphere_transparent_background.png", getString(R.string.earth_descr)),
        PlanetData("Марс", "від 401 млн км до 56 млн км", "https://www.pngall.com/wp-content/uploads/13/Mars-PNG-Picture.png", getString(R.string.mars_descr)),
            PlanetData("Юпітер", "від 588 до 967 млн км", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Jupiter.png/1200px-Jupiter.png",getString(R.string.jupiter_descr)),
        PlanetData("Сатурн", "від 8,0 до 11,1 а. о.", "https://assets.stickpng.com/images/580b585b2edbce24c47b270d.png", getString(R.string.saturn_descr)),
        PlanetData("Уран", "2600 млн. км", "https://cdn.pixabay.com/photo/2021/04/05/15/54/uranus-6153865_1280.png", getString(R.string.uranus_descr)),
        PlanetData("Нептун", "4,3 млрд км", "https://www.pngplay.com/wp-content/uploads/13/Neptune-PNG-Pic-Background.png", getString(R.string.neptune_descr)),
        PlanetData("Сонце", "149,6 млн. км", "https://cdn.pixabay.com/photo/2017/07/18/08/59/sun-2515252_1280.png", getString(R.string.sun_descr)),
        PlanetData("Місяць", "384402 км", "https://www.freepnglogos.com/uploads/moon-png/moon-png-thatoneangelfish-deviantart-9.png", getString(R.string.moon_descr)))


    }

    fun startDefinitionFragment(planet: PlanetData){
        val direction = SolarFragmentDirections.actionSolarFragmentToDefinitionFragment(planet)
        findNavController().navigate(direction)
    }
}