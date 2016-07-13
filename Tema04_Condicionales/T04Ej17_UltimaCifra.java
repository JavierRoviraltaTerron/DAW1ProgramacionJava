package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 17
 *
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej17_UltimaCifra {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.print("Introduce un número entero: ");
    
    numero = sc.nextInt();
    
    // La última cifra es el resto de dividir entre 10 y se hace mediante 
    // el módulo "%".
    System.out.println("Su última cifra es " + (numero % 10));
  }
}
