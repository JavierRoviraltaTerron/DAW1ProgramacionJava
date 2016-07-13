package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 9
 *
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo 
 * ax² + bx + c = 0).
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej09_EcuacionSegundoGrado {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    double c;
    double discriminante;

    System.out.print("Introduce el valor de a: ");
    
    a = sc.nextDouble();

    System.out.print("Introduce el valor de b: ");
    
    b = sc.nextDouble();

    System.out.print("Introduce el valor de c: ");
    
    c = sc.nextDouble();

    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("Infinitas soluciones.");
    }

    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("Sin solución.");
    }

    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x\u2081 = 0");
      System.out.println("x\u2082 = " + (-b / a));
    }

    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x\u2081 = x\u2082 = " + (-c / b));
    }

    if ((a != 0) && (b != 0) && (c != 0)) {

      discriminante = b * b - (4 * a * c);

      if (discriminante < 0) {
        System.out.println("Sin soluciones reales.");
      } else {
        System.out.println("x\u2081 = " + (-b + Math.sqrt(discriminante)) / (4 * a * c));
        System.out.println("x\u2082 = " + (-b - Math.sqrt(discriminante)) / (4 * a * c));
      }
    }
  }
}
