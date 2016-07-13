package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 7
 *
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej07_NotaMedia {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double nota1;
    double nota2;
    double nota3;
    double mediaNotas;

    System.out.print("Introduce la primera nota: ");
    
    nota1 = sc.nextDouble();

    if ((nota1 < 0) || (nota1 > 10)) {
      System.out.println("Nota incorrecta. Por favor, introduce valores "
              + "del 0 al 10.");
    } else {
      System.out.print("Introduce la segunda nota: ");
      
      nota2 = sc.nextDouble();

      if ((nota2 < 0) || (nota2 > 10)) {
        System.out.println("Nota incorrecta. Por favor, introduce valores "
                + "del 0 al 10.");
      } else {
        System.out.print("Introduce la tercera nota: ");
        
        nota3 = sc.nextDouble();
        
        mediaNotas = (nota1 + nota2 + nota3) / 3;

        if ((nota3 < 0) || (nota3 > 10)) {
          System.out.println("Nota incorrecta. Por favor, introduce valores "
                  + "del 0 al 10.");
        } else {
          System.out.printf("La nota media es %.1f\n", mediaNotas);
        }
      }
    }
  }
}
