package com.example.navigationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationapp.R
import com.example.navigationapp.databinding.FragmentOneBinding

class FragmentOne : Fragment() {

    private var _binding: FragmentOneBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        val view = binding.root

        val navHostFragment =
            activity?.supportFragmentManager?.findFragmentById(R.id.fragment_host) as NavHostFragment
        val navController = navHostFragment.navController

        binding.btn1.setOnClickListener{
            navController.navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

        binding.btn2.setOnClickListener{

            if (navController.currentDestination?.id == R.id.fragmentOne) {
                navController.navigate(R.id.action_fragmentOne_to_fragmentFour)
            }
        }

        binding.btn3.setOnClickListener{

            if (navController.currentDestination?.id == R.id.fragmentOne) {
                navController.navigate(R.id.action_fragmentOne_to_fragmentSix)
            }
        }

        return view
    }
}