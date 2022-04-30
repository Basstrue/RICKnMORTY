package com.example.ricknmorty.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ricknmorty.R
import com.example.ricknmorty.databinding.ActivityMainScreenBinding
import com.example.ricknmorty.ui.fragments.CharactersFragment
import com.example.ricknmorty.ui.fragments.EpisodesFragment
import com.example.ricknmorty.ui.fragments.LocationsFragment

class MainScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val charactersFragment = CharactersFragment()
        val locationsFragment = LocationsFragment()
        val episodesFragment = EpisodesFragment()

        switchFragment(charactersFragment)

        binding.bottomNavMenu.setOnItemSelectedListener{
            when (it.itemId){
                R.id.ic_characters -> switchFragment(charactersFragment)
                R.id.ic_locations -> switchFragment(locationsFragment)
                R.id.ic_episodes -> switchFragment(episodesFragment)
            }
            true
        }
    }

    private fun switchFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.main_scr_frame, fragment)
            commit()
        }
    }

}