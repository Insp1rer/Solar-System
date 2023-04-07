package com.example.solar_system
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(val name:String, val image:Int, var description:String):Parcelable