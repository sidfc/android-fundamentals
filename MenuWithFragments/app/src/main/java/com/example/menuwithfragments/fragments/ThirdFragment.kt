package com.example.menuwithfragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.menuwithfragments.R
import com.example.menuwithfragments.databinding.FragmentFirstBinding
import com.example.menuwithfragments.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {
    // https://developer.android.com/topic/libraries/view-binding
    private var _binding: FragmentThirdBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btn3.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_fourthFragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}