package com.example.donggrami.main.character

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.earth1round_aos.R
import com.example.earth1round_aos.databinding.FragmentCharacterBinding
import com.example.earth1round_aos.main.MainActivity
import com.example.earth1round_aos.main.course.CharacterCourseFragment
import com.example.earth1round_aos.main.home.HomeFragment
import com.example.earth1round_aos.main.setting.SettingActivity

class CharacterFragment : Fragment() {

    lateinit var binding: FragmentCharacterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentCharacterBinding.inflate(inflater, container, false)


        //화면 넘어가기
        binding.characterHamburgerBtnIv.setOnClickListener {
            startActivity(Intent(requireActivity(), SettingActivity::class.java))
        }


        binding.characterHomeTrophyIv.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, CharacterPrizeFragment()).commitAllowingStateLoss()
        }

        binding.characterHomeCharacterIv.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, CharacterSelectFragment()).commitAllowingStateLoss()
        }

        binding.characterHomeSelectCourse.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, CharacterCourseFragment()).commitAllowingStateLoss()
        }

        binding.characterHomeCumulateCl.setOnClickListener {
            startActivity(Intent(activity, CharacterCalenderActivity::class.java))
        }

        binding.characterHomeGoEarth.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HomeFragment()).commitAllowingStateLoss()
        }

        return binding.root
    }

}