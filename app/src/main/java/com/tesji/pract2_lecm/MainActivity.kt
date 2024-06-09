package com.tesji.pract2_lecm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.tesji.pract2_lecm.model.HotelModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtDias = findViewById<TextInputEditText>(R.id.txtDias)
        val txtPrecio = findViewById<TextInputEditText>(R.id.txtPrecio)
        val btnCalcular = findViewById<Button>(R.id.btn_Calcular)
        val myTextView = findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener(){
            val hotel = HotelModel()

            if(txtDias.text.toString().trim().isEmpty()){
                txtDias.setError("¿Y tu nombre papu?")
            }else{
                hotel.cantidadDias = txtDias.text.toString().toDouble()
            }
            if(txtPrecio.text.toString().trim().isEmpty()){
                txtPrecio.setError("¿Y tu nombre papu?")
            }else{
                hotel.cantidadPrecio = txtPrecio.text.toString().toDouble()
            }
            myTextView.text = hotel.calcularVenta()
        }

    }
}