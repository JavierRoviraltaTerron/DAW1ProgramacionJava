package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 21
 *
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de
 * la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la
 * nota media anterior.
 *
 * Ejemplo 1: Nota del primer control: 7 Nota del segundo control: 10 Tu nota de
 * Programación es 8.5
 *
 * Ejemplo 2: Nota del primer control: 6 Nota del segundo control: 3 ¿Cuál ha
 * sido el resultado de la recuperación? (apto/no apto): apto Tu nota de
 * Programación es 5
 *
 * Ejemplo 3: Nota del primer control: 6 Nota del segundo control: 3 ¿Cuál ha
 * sido el resultado de la recuperación? (apto/no apto): no apto Tu nota de
 * Programación es 4.5
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej21_NotaMediaTrimestre {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double nota1;
    double nota2;
    double media;
    String recuperacion;

    System.out.print("Nota del primer control: ");

    nota1 = sc.nextDouble();

    System.out.print("Nota del segundo control: ");

    nota2 = sc.nextDouble();

    media = (nota1 + nota2) / 2;

    if (((nota1 >= 0) && (nota1 <= 10)) && ((nota2 >= 0) && (nota2 <= 10))) {
      if (media < 5) {
        System.out.print("¿Cuál ha sido el resultado de la recuperación? "
                + "(apto/no apto): ");

        // Debido a la forma en que trabaja la clase Scanner, el uso de .nextLine()
        // puede causar que se salte el siguiente código, ya que lo considera un
        // salto de línea. Para contrarrestar dicho salto, simplemente se utiliza
        // nuevamente .nextLine() . Otra opción es usar .next(), que no causa el
        // error.
        recuperacion = sc.next().trim().toLowerCase();

        media = ((recuperacion.equals("apto")) ? 5 : media);
      }

      System.out.printf("Tu nota de Programación es %.1f\n", media);
    } else {
      System.out.println("Por favor, introduce correctamente las notas.");
    }
  }
}
