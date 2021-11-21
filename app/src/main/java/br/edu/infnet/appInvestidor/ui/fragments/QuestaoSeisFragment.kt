package br.edu.infnet.appInvestidor.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.fragment_questao_seis.*

class QuestaoSeisFragment : Fragment() {

    lateinit var radioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_seis, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoSeisProximoFragment.setOnClickListener {

            respostaSeis = onRadioButtonClicked()

            println("Resposta 6:")
            println(respostaSeis)


            findNavController().navigate(R.id.action_questaoSeisFragment_to_questaoSeteFragment)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoSeis!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoSeis.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoSeisA ->
                pontos = 1

            radioButtonQuestaoSeisB ->
                pontos = 2

            radioButtonQuestaoSeisC ->
                pontos = 3

            radioButtonQuestaoSeisD ->
                pontos = 4


        }
        return pontos
    }
}