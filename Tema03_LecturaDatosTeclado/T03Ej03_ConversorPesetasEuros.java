package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 3
 *
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej03_ConversorPesetasEuros {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int pesetas;
    int pesetasPorCadaEuro = 166;
    double resultado;

    System.out.print("Por favor, introduce una cantidad en pts: ");

    pesetas = sc.nextInt();

    resultado = pesetas / pesetasPorCadaEuro;

    System.out.printf("Resultado: %.2f€\n", resultado);
  }
}
