package com.example.menuwithfragments.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.menuwithfragments.R
import com.example.menuwithfragments.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    // https://developer.android.com/topic/libraries/view-binding
    private var _binding: FragmentFirstBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btn1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_fourthFragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}