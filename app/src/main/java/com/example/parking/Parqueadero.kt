package com.example.parking

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*

class Parqueadero(placa: String, cilindrada: String, tipoVehiculo: String) : Cobro {

    private val capacidadCarros = 20
    private val capacidadMotos = 10
    private val diasSemana =
        arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    private val horaCarro = 1000
    private val horaMoto = 500
    private val diaCarro = 9000
    private val diaMoto = 4000
    private val excedenteCilindradaMoto = 2000
    var placa = placa
    var cilindrada = cilindrada
    var tipoVehiculo = tipoVehiculo


    @RequiresApi(Build.VERSION_CODES.O)
    override fun generarFechaActual() {
        var localDate = LocalDate.now()
        var fechaActual = localDate
        println("oe $fechaActual")

    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun generarHoraActual() {
        var localTime = LocalTime.now()
        var horaActual = localTime
        println("oe $horaActual")

    }




}