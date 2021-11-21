package br.edu.infnet.appInvestidor.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.fragment_questao_sete.*

class QuestaoSeteFragment : Fragment() {

    lateinit var radioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_sete, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoSeteProximoFragment.setOnClickListener {

            respostaSete = onRadioButtonClicked()

            println("Resposta 7:")
            println(respostaSete)

            findNavController().navigate(R.id.action_questaoSeteFragment_to_questaoOitoFragment)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoSete!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoSete.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoSeteA ->
                pontos = 1

            radioButtonQuestaoSeteB ->
                pontos = 2

            radioButtonQuestaoSeteC ->
                pontos = 3

            radioButtonQuestaoSeteD ->
                pontos = 4

        }
        return pontos
    }
}