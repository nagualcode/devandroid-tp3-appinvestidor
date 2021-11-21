package br.edu.infnet.appInvestidor.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.infnet.appInvestidor.R
import kotlinx.android.synthetic.main.activity_resultado.*
import br.edu.infnet.appInvestidor.ui.fragments.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        textViewValorResultado.text = "Seu perfil é: " + calculaPerfil().toString()
    }

    private fun calculaPerfil(): String {
        val somapontos: Int = respostaUm + respostaDois + respostaTres + respostaQuatro + respostaCinco + respostaSeis + respostaSete + respostaOito + respostaNove
        if (somapontos >= 30) {
            return "Arrojado"
        } else if (somapontos >= 13) {
            return "Moderado" }
        return "Conversador"
    }
}