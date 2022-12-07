package com.mirnakrpic.orwima_lv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        val returnBtn = view.findViewById<Button>(R.id.backButton)
        val resultText = view.findViewById<TextView>(R.id.resultText)

        resultText.text = arguments?.getString("BUTTON").toString()

        returnBtn.setOnClickListener{
            var nextFragment = RadioFragment()
            val fragmentTransaction: FragmentTransaction? = activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainer, nextFragment)
            fragmentTransaction?.commit()
        }
        return view
    }
}