package com.zoteldev.androidfirst.imccalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zoteldev.androidfirst.R

class ImcCalculatorActivity : AppCompatActivity() {

    private lateinit var viewMale: CardView

    private lateinit var viewFemale: CardView

    private var isMaleSelected: Boolean = true

    private var isFemaleSelected: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
        initListeners()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }

    private fun initListeners() {
        viewMale.setOnClickListener { setGenderColor(isMaleSelected) }
        viewFemale.setOnClickListener { setGenderColor(isFemaleSelected) }
    }

    private fun setGenderColor(isViewSelected:Boolean) {

        viewMale.setCardBackgroundColor()
    }
}