package com.zoteldev.androidfirst.imccalculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zoteldev.androidfirst.R
import com.zoteldev.androidfirst.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_imcactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        initComponents()
        initUI(result)

    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
    }

    private fun initUI(result:Double) {

        tvIMC.text = result.toString()

        when(result) {
            in 0.00..18.50 -> { // Bajo peso
                tvResult.text
                tvDescription.text
            }
            in 18.51..24.99 -> { // Peso normal
                tvResult.text
                tvDescription.text
            }
            in 25.00..29.99 -> { // Sobrepeso
                tvResult.text
                tvDescription.text
            }
            in 30.00..99.00 -> { // Obesidad
                tvResult.text
                tvDescription
            }
            else -> { // Error
                tvResult.text = getString(R.string.error)
                tvIMC.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)

             }
        }
    }

}