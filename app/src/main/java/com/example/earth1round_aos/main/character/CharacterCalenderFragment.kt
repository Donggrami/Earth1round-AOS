package com.example.donggrami.main.character

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.earth1round_aos.databinding.FragmentCharacterCalenderBinding

class CharacterCalenderFragment : Fragment() {

    lateinit var binding: FragmentCharacterCalenderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentCharacterCalenderBinding.inflate(inflater, container, false)

        return binding.root
    }


}