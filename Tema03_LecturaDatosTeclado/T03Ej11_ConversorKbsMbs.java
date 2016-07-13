package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 11
 *
 * Realiza un conversor de Kb a Mb.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej11_ConversorKbsMbs {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double numKb;
    double KbsPorCadaMb = 1024;
    double resultado;

    System.out.print("Introduce el número de Kbs: ");

    numKb = sc.nextDouble();

    resultado = numKb / KbsPorCadaMb;

    System.out.printf("%.1fKb = %.1fMb\n", numKb, resultado);
  }
}
