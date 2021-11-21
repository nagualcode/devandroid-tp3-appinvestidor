package br.edu.infnet.appInvestidor.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.fragment_questao_oito.*

class QuestaoOitoFragment : Fragment() {

    lateinit var radioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_oito, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoOitoProximoFragment.setOnClickListener {

            respostaOito = onRadioButtonClicked()

            println("Resposta 8:")
            println(respostaOito)


            findNavController().navigate(R.id.action_questaoOitoFragment_to_questaoNoveFragment)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoOito!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoOito.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoOitoA ->
                pontos = 1

            radioButtonQuestaoOitoB ->
                pontos = 2

            radioButtonQuestaoOitoC ->
                pontos = 3

            radioButtonQuestaoOitoD ->
                pontos = 4

        }
        return pontos
    }
}