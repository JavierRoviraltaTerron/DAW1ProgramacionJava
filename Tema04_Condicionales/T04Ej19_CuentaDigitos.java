package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 19
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej19_CuentaDigitos {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.print("Introduce un número entero de hasta 5 dígitos: ");
    
    numero = sc.nextInt();

    if ((numero < 10) && (numero > -10)) {
      System.out.println("Este número tiene un dígito.");
    } else if (((numero >= 10) && (numero < 100)) || ((numero <= -10) 
            && (numero > -100))) {
      System.out.println("Este número tiene dos dígitos.");
    } else if (((numero >= 100) && (numero < 1000)) || ((numero <= -100) 
            && (numero > -1000))) {
      System.out.println("Este número tiene tres dígitos.");
    } else if (((numero >= 1000) && (numero < 10000)) || ((numero <= -1000) 
            && (numero > -10000))) {
      System.out.println("Este número tiene cuatro dígitos.");
    } else if (((numero >= 10000) && (numero < 100000)) || ((numero <= -10000) 
            && (numero > -100000))) {
      System.out.println("Este número tiene cinco dígitos.");
    } else {
      System.out.println("Introduce solo números de hasta 5 dígitos.");
    }
  }
}
