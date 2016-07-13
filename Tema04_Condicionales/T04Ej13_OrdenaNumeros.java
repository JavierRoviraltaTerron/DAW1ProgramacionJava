package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 13
 *
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej13_OrdenaNumeros {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int c;

    System.out.print("Introduce el primer número: ");
    
    a = sc.nextInt();

    System.out.print("Introduce el segundo número: ");
    
    b = sc.nextInt();

    System.out.print("Introduce el tercer número: ");

    c = sc.nextInt();

    if ((a <= b) && (b <= c)) {
      System.out.println("Ordenados: " + a + " " + b + " " + c);
    } else if ((b < a) && (a <= c)) {
      System.out.println("Ordenados: " + b + " " + a + " " + c);
    } else if ((b <= c) && (c < a)) {
      System.out.println("Ordenados: " + b + " " + c + " " + a);
    } else if ((a < c) && (c < b)) {
      System.out.println("Ordenados: " + a + " " + c + " " + b);
    } else if ((c < a) && (a < b)) {
      System.out.println("Ordenados: " + c + " " + a + " " + b);
    } else if ((c < b) && (b < a)) {
      System.out.println("Ordenados: " + c + " " + b + " " + a);
    }
  }
}
