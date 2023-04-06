package com.example.animals_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animals_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val panda = Animal("Червона панда", R.drawable.panda, getString(R.string.panda_description))
        val quokka = Animal("Квокка", R.drawable.quokka, getString(R.string.quokka_description))
        val calibri = Animal("Колібрі", R.drawable.hummingbird, getString(R.string.calibri_description))

        binding.button1.setOnClickListener{
            val i = Intent(this, Definition::class.java)
            i.putExtra("animal", panda)
            startActivity(i)
        }

        binding.button2.setOnClickListener{
            val i = Intent(this, Definition::class.java)
            i.putExtra("animal", quokka)
            startActivity(i)
        }

        binding.button3.setOnClickListener{
            val i = Intent(this, Definition::class.java)
            i.putExtra("animal", calibri)
            startActivity(i)
        }

    }
}
