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

        binding.characterHamburgerBtnIv.setOnClickListener {
//            (context as MainActivity).supportFragmentManager.beginTransaction()
//                .replace(R.id. main_frm, SettingFragment()).commitAllowingStateLoss()
            startActivity(Intent(requireActivity(), SettingActivity::class.java))
        }

        binding.characterHomeTrophyIv.setOnClickListener {
            startActivity(Intent(activity, CharacterPrizeFragment::class.java))
        }

        binding.characterHomeCharacterIv.setOnClickListener {
            startActivity(Intent(activity, CharacterSelectFragment::class.java))
        }

        binding.characterHomeSelectCourse.setOnClickListener {
            startActivity(Intent(activity, CharacterCourseFragment::class.java))
        }

        binding.characterHomeCumulateNumTv.setOnClickListener {
            startActivity(Intent(activity, CharacterCalenderFragment::class.java))
        }

        binding.characterHomeGoEarth.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HomeFragment()).commitAllowingStateLoss()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //binding = null
    }
}