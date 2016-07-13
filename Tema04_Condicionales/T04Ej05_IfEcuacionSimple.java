package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 5
 *
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 * b = 0).
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej05_IfEcuacionSimple {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    double ecuacion;
    
    System.out.print("Introduce el valor de a: ");
    
    a = sc.nextDouble();

    System.out.print("Introduce el valor de b: ");
    
    b = sc.nextDouble();

    if (a == 0) {
      System.out.println("Esta ecuación no tiene solución, puesto que \"a\" es "
              + "igual a 0.");
    } else {
      ecuacion = -b / a;
      System.out.println("x = " + ecuacion);
    }
  }
}
