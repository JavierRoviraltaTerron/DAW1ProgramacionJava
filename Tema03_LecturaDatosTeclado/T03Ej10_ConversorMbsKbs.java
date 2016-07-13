package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 10
 *
 * Realiza un conversor de Mb a Kb.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej10_ConversorMbsKbs {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double numMb;
    double KbsPorCadaMb = 1024;
    double resultado;

    System.out.print("Introduce el número de Mbs: ");

    numMb = sc.nextDouble();

    resultado = numMb * KbsPorCadaMb;

    System.out.printf("%.1fMb = %.1fKb\n", numMb, resultado);
  }
}
