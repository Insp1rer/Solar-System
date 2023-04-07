package com.example.solar_system

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.solar_system.databinding.FragmentDefinitionBinding

class DefinitionFragment: Fragment(R.layout.fragment_definition){

    val args: DefinitionFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentDefinitionBinding.bind(view)

        val planet = args.planet

        binding.titleInfo.text = planet.name
        binding.distanceInfo.text = planet.distance

        binding.overviewInfo.text = planet.description
        Glide
            .with(binding.root)
            .load(planet.image)
            .into(binding.planetImgInfo)
        binding.backButton.setOnClickListener{
            findNavController().popBackStack()
        }
    }

}