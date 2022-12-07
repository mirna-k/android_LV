package com.mirnakrpic.orwima_lv2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.FragmentTransaction

class RadioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_radio, container, false)
        val nextBtn = view.findViewById<Button>(R.id.nextButton)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)

        nextBtn.setOnClickListener{
            val nextFragment = ResultFragment()
            val radioBtn = view.findViewById<RadioButton>(radioGroup.checkedRadioButtonId)

            val bundle = Bundle()
            bundle.putString("BUTTON", radioBtn.text.toString())
            nextFragment.arguments = bundle

            val fragmentTransaction: FragmentTransaction? = activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainer, nextFragment)
            fragmentTransaction?.commit()
        }

        return view
    }
}