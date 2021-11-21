package br.edu.infnet.appInvestidor.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.fragment_questao_cinco.*
import kotlinx.android.synthetic.main.fragment_questao_dois.*

class QuestaoDoisFragment : Fragment() {

    lateinit var radioButton: RadioButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_dois, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoDoisProximoFragment.setOnClickListener {

            respostaDois = onRadioButtonClicked()

            println("Resposta 2:")
            println(respostaDois)


            findNavController().navigate(R.id.action_questaoDoisFragment_to_questaoTresFragment)
        }
    }



    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoDois!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoDois.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoDoisA ->
                pontos = 1

            radioButtonQuestaoDoisB ->
                pontos = 2

            radioButtonQuestaoDoisC ->
                pontos = 3

            radioButtonQuestaoDoisD ->
                pontos = 4

        }
        return pontos
    }
}