package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 8
 *
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej08_NotaMediaEvaluada {

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
          System.out.printf("La nota media es %.1f", mediaNotas);

          if ((mediaNotas >= 0) && (mediaNotas < 5)) {
            System.out.println(" ¡¡¡INSUFICIENTE!!!");
          } else if ((mediaNotas >= 5) && (mediaNotas < 6)) {
            System.out.println(" ¡SUFICIENTE!");
          } else if ((mediaNotas >= 6) && (mediaNotas < 7)) {
            System.out.println(" ¡BIEN!");
          } else if ((mediaNotas >= 7) && (mediaNotas < 9)) {
            System.out.println(" ¡NOTABLE!");
          } else if ((mediaNotas >= 9) && (mediaNotas <= 10)) {
            System.out.println(" ¡SOBRESALIENTE!");
          }
        }
      }
    }
  }
}
