package br.edu.infnet.appInvestidor.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.fragment_questao_um.*


class QuestaoUmFragment : Fragment() {

//    private lateinit var resultado : ResultadoActivity

//    private var pontuacao = 0

    lateinit var radioButton: RadioButton

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_um, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoUmProximoFragment.setOnClickListener {

            respostaUm = onRadioButtonClicked()

            println("Resposta 1:")
            println(respostaUm)

            findNavController().navigate(R.id.action_questaoUmFragment_to_questaoDoisFragment)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontos = 0
        val selectedOption: Int = this.radioGroupQuestaoUm!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoUm.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoUmA ->
                pontos = 1

            radioButtonQuestaoUmB ->
                pontos = 2

            radioButtonQuestaoUmC ->
                pontos = 3

            radioButtonQuestaoUmD ->
                pontos = 4
        }
        return pontos
    }

}



