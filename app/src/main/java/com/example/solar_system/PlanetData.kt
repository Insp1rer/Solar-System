package com.example.solar_system

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PlanetData (
    val name: String,
    val distance: String,
    val image: String,
    val description: String,
): Parcelable