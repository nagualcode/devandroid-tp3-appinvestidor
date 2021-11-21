package br.edu.infnet.appInvestidor.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.fragment_questao_nove.*

class QuestaoNoveFragment : Fragment() {

    lateinit var radioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_nove, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoNoveProximoFragment.setOnClickListener {

            respostaNove = onRadioButtonClicked()

            println("Resposta 9:")
            println(respostaNove)


            findNavController().navigate(R.id.action_questaoNoveFragment_to_resultadoActivity2)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoNove!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoNove.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoNoveA ->
                pontos = 1

            radioButtonQuestaoNoveB ->
                pontos = 2

            radioButtonQuestaoNoveC ->
                pontos = 3

            radioButtonQuestaoNoveD ->
                pontos = 4

            radioButtonQuestaoNoveE ->
                pontos = 5

        }
        return pontos
    }
}