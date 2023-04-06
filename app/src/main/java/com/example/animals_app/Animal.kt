package com.example.animals_app
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(val name:String, val image:Int, var description:String):Parcelable