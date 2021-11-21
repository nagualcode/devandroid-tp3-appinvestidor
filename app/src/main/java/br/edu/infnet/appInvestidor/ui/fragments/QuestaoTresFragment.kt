package br.edu.infnet.appInvestidor.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.fragment_questao_tres.*

class QuestaoTresFragment : Fragment() {

    lateinit var radioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_tres, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoTresProximoFragment.setOnClickListener {

            respostaTres = onRadioButtonClicked()

            println("Resposta 3:")
            println(respostaTres)

            findNavController().navigate(R.id.action_questaoTresFragment_to_questaoQuatroFragment)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoTres!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoTres.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoTresA ->
                pontos = 1

            radioButtonQuestaoTresB ->
                pontos = 2

            radioButtonQuestaoTresC ->
                pontos = 3

            radioButtonQuestaoTresD ->
                pontos = 4

        }
        return pontos
    }
}