package com.ejemplo;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

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


    // ContarVocales incorrectos
    @Test
    public void testContarVocales_incorrecto_esperaMas() {
        assertEquals(10, StringUtils.contarVocales("Hola mundo"));
    }

    @Test
    public void testContarVocales_incorrecto_esperaMenos() {
        assertEquals(0, StringUtils.contarVocales("aeiou"));
    }

    // @Test
    // public void testContarVocales_incorrecto_vacioEsUno() {
    //     assertEquals(1, StringUtils.contarVocales(""));
    // }

    // Invertir correctos
    // @Test
    // public void testInvertir_palabra() {
    //     assertEquals("aloh", StringUtils.invertir("hola"));
    // }

    // @Test
    // public void testInvertir_fraseConEspacios() {
    //     assertEquals("odnum aloh", StringUtils.invertir("hola mundo"));
    // }

    // @Test
    // public void testInvertir_vacio() {
    //     assertEquals("", StringUtils.invertir(""));
    // }

    // Invertir incorrectos
    // @Test
    // public void testInvertir_incorrecto1() {
    //     assertEquals("hola", StringUtils.invertir("hola"));
    // }

    // @Test
    // public void testInvertir_incorrecto2() {
    //     assertEquals("odnumaloh", StringUtils.invertir("hola mundo"));
    // }

    // @Test
    // public void testInvertir_incorrecto3() {
    //     assertEquals(null, StringUtils.invertir("abc"));
    // }

    // Palindromo correctos
    // @Test
    // public void testEsPalindromo_palindromoSimple() {
    //     assertTrue(StringUtils.esPalindromo("oso"));
    // }

    // @Test
    // public void testEsPalindromo_palindromoConMayusculas() {
    //     assertTrue(StringUtils.esPalindromo("Reconocer"));
    // }

    // @Test
    // public void testEsPalindromo_noPalindromo() {
    //     assertFalse(StringUtils.esPalindromo("hola"));
    // }

    // Palindromo incorrectos
    // @Test
    // public void testEsPalindromo_incorrecto_esperaTrue() {
    //     assertTrue(StringUtils.esPalindromo("casa"));
    // }

    // @Test
    // public void testEsPalindromo_incorrecto_esperaFalse() {
    //     assertFalse(StringUtils.esPalindromo("anilina"));
    // }

    // @Test
    // public void testEsPalindromo_incorrecto_vacioEsTrue() {
    //     assertTrue(StringUtils.esPalindromo(""));
    // }
} 