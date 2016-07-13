package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 20
 *
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej20_NumeroCapicua {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un número entero positivo de hasta 5 dígitos: ");

    numero = sc.nextInt();

    if ((numero >= 0) && (numero <= 99999)) {

      if ((numero < 10) && (numero >= 0)) {
        System.out.println("Este número es capicúa.");
      } else if (((numero >= 10) && (numero < 100)) 
              && ((numero % 10) == (numero / 10))) {
        System.out.println("Este número es capicúa.");
      } else if (((numero >= 100) && (numero < 1000)) 
              && ((numero % 10) == (numero / 100))) {
        System.out.println("Este número es capicúa.");
      } else if (((numero >= 1000) && (numero < 10000)) 
              && ((numero % 10) == (numero / 1000)) 
              && ((numero / 100) % 10) == ((numero / 10) % 10)) {
        System.out.println("Este número es capicúa.");
      } else if (((numero >= 10000) && (numero <= 99999)) 
              && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        System.out.println("Este número es capicúa.");
      } else {
        System.out.println("Este número no es capicúa.");
      }
      
    } else {
      System.out.println("El número introducido no es válido.");
    }
  }
}
