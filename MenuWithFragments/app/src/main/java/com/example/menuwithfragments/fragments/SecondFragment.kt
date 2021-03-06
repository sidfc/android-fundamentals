package com.example.menuwithfragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.menuwithfragments.R
import com.example.menuwithfragments.databinding.FragmentFirstBinding
import com.example.menuwithfragments.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
    // https://developer.android.com/topic/libraries/view-binding
    private var _binding: FragmentSecondBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btn2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_fourthFragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}