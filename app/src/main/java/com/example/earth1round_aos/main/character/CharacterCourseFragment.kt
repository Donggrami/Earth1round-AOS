package com.example.donggrami.main.character

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.earth1round_aos.R
import com.example.earth1round_aos.databinding.FragmentCharacterCourseBinding
import com.example.earth1round_aos.main.MainActivity
import com.example.earth1round_aos.main.character.MapsActivity
import com.example.earth1round_aos.main.home.HomeFragment


class CharacterCourseFragment : Fragment() {

    lateinit var binding : FragmentCharacterCourseBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentCharacterCourseBinding.inflate(inflater, container, false)

        //화면 돌아가기
        binding.characterCourseBackIv.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id. main_frm, CharacterFragment()).commitAllowingStateLoss()
        }

        return binding.root
    }

}

