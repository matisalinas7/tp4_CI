package com.ejemplo;

public class StringUtils {
  public static int contarVocales(String texto) {
    if (texto == null) return 0;
    int count = 0;
    for (char c : texto.toLowerCase().toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count++;
      }
    }
    return count;
  }

  public static String invertir(String texto) {
    if (texto == null) return null;
    return new StringBuilder(texto).reverse().toString();
  }

  public static boolean esPalindromo(String texto) {
    if (texto == null || texto.length() == 0) return false;
    String normalizado = texto.toLowerCase();
    int i = 0, j = normalizado.length() - 1;
    while (i < j) {
      if (normalizado.charAt(i) != normalizado.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }


    //// aa
    return true;
  }
}
