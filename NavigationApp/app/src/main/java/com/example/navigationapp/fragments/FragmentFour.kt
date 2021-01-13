package com.example.navigationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationapp.R
import com.example.navigationapp.databinding.FragmentFourBinding
import com.example.navigationapp.databinding.FragmentTwoBinding

class FragmentFour : Fragment() {

    private var _binding: FragmentFourBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFourBinding.inflate(inflater, container, false)
        val view = binding.root

        val navHostFragment =
            activity?.supportFragmentManager?.findFragmentById(R.id.fragment_host) as NavHostFragment
        val navController = navHostFragment.navController

        binding.f4Btn1.setOnClickListener{
            navController.navigate(R.id.action_fragmentFour_to_fragmentFive)
        }

        return view
    }

}