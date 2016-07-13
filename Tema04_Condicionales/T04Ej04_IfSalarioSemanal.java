package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 4
 *
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej04_IfSalarioSemanal {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double numHoras;
    double salario;
    double salarioHorasExtra;

    System.out.print("Por favor, introduce el número de horas de trabajo esta "
            + "semana: ");
    
    numHoras = sc.nextDouble();

    if ((numHoras >= 0) && (numHoras <= 40)) {
      salario = numHoras * 12;
      System.out.printf("El salario semanal es de %.2f€.\n", salario);
    } else if (numHoras > 40) {
      salarioHorasExtra = (40 * 12) + ((numHoras - 40) * 16);
      System.out.printf("El salario semanal con horas extra es de %.2f€.\n", salarioHorasExtra);
    } else {
      System.out.println("El número introducido no es válido.");
    }
  }
}
