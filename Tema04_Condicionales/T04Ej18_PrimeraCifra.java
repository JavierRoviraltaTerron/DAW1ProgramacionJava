package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 18
 *
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej18_PrimeraCifra {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    int primeracifra = 0;
    System.out.print("Introduce un número positivo entero de hasta 5 dígitos: ");

    numero = sc.nextInt();

    if ((numero >= 0) && (numero <= 99999)) {
      
      if ((numero >= 0) && (numero < 10)) {
        primeracifra = numero;
      } else if ((numero >= 10) && (numero < 100)) {
        primeracifra = numero / 10;
      } else if ((numero >= 100) && (numero < 1000)) {
        primeracifra = numero / 100;
      } else if ((numero >= 1000) && (numero < 10000)) {
        primeracifra = numero / 1000;
      } else if ((numero >= 10000) && (numero <= 99999)) {
        primeracifra = numero / 10000;
      }
      
      System.out.println("Su primera cifra es " + primeracifra);
    } else {
      System.out.println("El número introducido no es válido.");
    }
  }
}
