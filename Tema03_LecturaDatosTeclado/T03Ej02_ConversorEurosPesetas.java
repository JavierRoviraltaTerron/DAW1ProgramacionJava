package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 2
 *
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej02_ConversorEurosPesetas {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double euros;
    int pesetasPorCadaEuro = 166;
    double resultado;

    System.out.print("Por favor, introduce una cantidad en €: ");

    euros = sc.nextInt();

    resultado = euros * pesetasPorCadaEuro;

    // (int)resultado fuerza la visualización de decimal (double) como entero (int)
    System.out.println("Resultado: " + (int)resultado + "pts");
  }
}
