package com.ejemplo;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testContarVocales() {
        // TODO: Implementar prueba
    }

    @Test
    public void testInvertir() {
        // TODO: Implementar prueba
    }

    @Test
    public void testEsPalindromo() {
        // TODO: Implementar prueba
    }

    // Contar vocales correctos
    @Test
    public void testContarVocales_variasVocales() {
        assertEquals(4, StringUtils.contarVocales("Hola mundo"));
    }

    @Test
    public void testContarVocales_sinVocales() {
        assertEquals(0, StringUtils.contarVocales("rhythm"));
    }

    @Test
    public void testContarVocales_vacio() {
        assertEquals(0, StringUtils.contarVocales(""));
    }


    // Casos incorrectos para contarVocales
    @Test
    public void testContarVocales_incorrecto_esperaMas() {
        // Espera 10, pero la función correcta devolvería 4
        assertEquals(10, StringUtils.contarVocales("Hola mundo"));
    }

    @Test
    public void testContarVocales_incorrecto_esperaMenos() {
        // Espera 0, pero la función correcta devolvería 5
        assertEquals(0, StringUtils.contarVocales("aeiou"));
    }

    @Test
    public void testContarVocales_incorrecto_vacioEsUno() {
        // Espera 1, pero la función correcta devolvería 0
        assertEquals(1, StringUtils.contarVocales(""));
    }

    // Invertir correctos
    @Test
    public void testInvertir_palabra() {
        assertEquals("aloh", StringUtils.invertir("hola"));
    }

    @Test
    public void testInvertir_fraseConEspacios() {
        assertEquals("odnum aloh", StringUtils.invertir("hola mundo"));
    }

    @Test
    public void testInvertir_vacio() {
        assertEquals("", StringUtils.invertir(""));
    }

    // Invertir incorrectos
    @Test
    public void testInvertir_incorrecto1() {
        assertEquals("hola", StringUtils.invertir("hola"));
    }

    @Test
    public void testInvertir_incorrecto2() {
        assertEquals("odnumaloh", StringUtils.invertir("hola mundo"));
    }

    @Test
    public void testInvertir_incorrecto3() {
        assertEquals(null, StringUtils.invertir("abc"));
    }

    // Palindromo correctos
    @Test
    public void testEsPalindromo_palindromoSimple() {
        assertTrue(StringUtils.esPalindromo("oso"));
    }

    @Test
    public void testEsPalindromo_palindromoConMayusculas() {
        assertTrue(StringUtils.esPalindromo("Reconocer"));
    }

    @Test
    public void testEsPalindromo_noPalindromo() {
        assertFalse(StringUtils.esPalindromo("hola"));
    }

    // Palindromo incorrectos
    @Test
    public void testEsPalindromo_incorrecto_esperaTrue() {
        // "casa" no es palíndromo, pero espera true (debe fallar)
        assertTrue(StringUtils.esPalindromo("casa"));
    }

    @Test
    public void testEsPalindromo_incorrecto_esperaFalse() {
        // "anilina" es palíndromo, pero espera false (debe fallar)
        assertFalse(StringUtils.esPalindromo("anilina"));
    }

    @Test
    public void testEsPalindromo_incorrecto_vacioEsTrue() {
        // Cadena vacía, espera true (debe fallar si la implementación considera vacía como no palíndromo)
        assertTrue(StringUtils.esPalindromo(""));
    }
} 