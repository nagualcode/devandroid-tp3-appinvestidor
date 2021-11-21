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

class QuestaoCincoFragment : Fragment() {

    lateinit var radioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_cinco, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoCincoProximoFragment.setOnClickListener {

            respostaCinco = onRadioButtonClicked()

            println("Resposta 5:")
            println(respostaCinco)

            findNavController().navigate(R.id.action_questaoCincoFragment_to_questaoSeisFragment)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoCinco!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoCinco.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoCincoA ->
                pontos = 1

            radioButtonQuestaoCincoB ->
                pontos = 2

            radioButtonQuestaoCincoC ->
                pontos = 3

        }
        return pontos
    }

}