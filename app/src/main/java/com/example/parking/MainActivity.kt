package com.example.parking

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  registrarPlaca()

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun recolectora() {
        var parqueadero = Parqueadero("ABD894", "100", "carro")
        var hora = parqueadero.generarHoraActual()
        var fecha = parqueadero.generarFechaActual()
        println("oe " + parqueadero.tipoVehiculo)
        var cc = parqueadero.cilindrada

        println("oe $cc")
    }

   /* fun registrarPlaca() {
        var btnEnviarPlaca: Button = findViewById(R.id.btn_enviar_placa)
        btnEnviarPlaca.setOnClickListener{
            Toast.makeText(this.applicationContext,"Evento Boton",Toast.LENGTH_SHORT).show()
        }

    } */

}