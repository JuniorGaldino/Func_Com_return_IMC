package com.example.func_com_return_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn_resultado.setOnClickListener() {
            Btn_imc.text =
                calcularImc(Peso.text.toString().toDouble(),Altura.text.toString().toDouble()).toString()
        }
    }
    fun calcularImc(peso: Double=Peso.text.toString().toDouble(), altura: Double =
        Altura.text.toString().toDouble()):String{
        return String.format("%.2f",peso/(altura*altura))

        }

    }
