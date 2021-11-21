package br.edu.infnet.appInvestidor.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.fragment_questao_quatro.*

class QuestaoQuatroFragment : Fragment() {

    lateinit var radioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_quatro, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoQuatroProximoFragment.setOnClickListener {
            respostaQuatro = onRadioButtonClicked()

            println("Resposta 4:")
            println(respostaQuatro)

            findNavController().navigate(R.id.action_questaoQuatroFragment_to_questaoCincoFragment)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoQuatro!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoQuatro.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoQuatroA ->
                pontos = 1

            radioButtonQuestaoQuatroB ->
                pontos = 2

            radioButtonQuestaoQuatroC ->
                pontos = 3


        }
        return pontos
    }
}