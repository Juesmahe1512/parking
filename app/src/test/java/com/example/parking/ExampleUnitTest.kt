package com.example.parking

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun pruebaSumandosADN() {

        //Arrange
        var prueba = pruebaSuma()
        var resultadoEsperado = 10

        //Act
        var resultado = prueba.sumaDosNumeros(5, 5)

        //Assert
        assertEquals(resultadoEsperado, resultado)
    }
}