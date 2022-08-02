package com.example.challanges6.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.challanges6.R
import com.example.challanges6.databinding.FragmentPesanBinding

class PesanFragment : Fragment() {

    private var _binding : FragmentPesanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPesanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPesan.setOnClickListener {
            findNavController().navigate(R.id.action_pesanFragment_to_showTiketFragment)
        }
    }
}