package br.edu.infnet.appInvestidor.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.infnet.appInvestidor.R
import br.edu.infnet.appInvestidor.navigation.NavigateActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonIniciar.setOnClickListener {
            val navigate = Intent(this, NavigateActivity ::class.java)
            startActivity(navigate)
        }
    }
}