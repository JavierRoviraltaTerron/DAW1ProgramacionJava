package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 14
 *
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej14_NumeroParDivisible {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.print("Introduce un número: ");
    
    numero = sc.nextInt();

    if ((numero % 2) == 0) {
      System.out.println("El número es par.");
    } else {
      System.out.println("El número es impar.");
    }

    if ((numero % 5) == 0) {
      System.out.println("El número es divisible por cinco.");
    } else {
      System.out.println("El número no es divisible por cinco.");
    }
  }
}
