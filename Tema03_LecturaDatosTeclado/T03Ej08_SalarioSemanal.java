package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 8
 *
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej08_SalarioSemanal {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int numDias = 5;
    double numHoras;
    double precioHora = 12;
    double salario;
    
    System.out.print("Introduce el número de horas de trabajo diario: ");
    
    numHoras = sc.nextDouble();
    
    salario = numDias * numHoras * precioHora;
    
    System.out.printf("El salario semanal es de %.2f€\n", salario);
  }
}
