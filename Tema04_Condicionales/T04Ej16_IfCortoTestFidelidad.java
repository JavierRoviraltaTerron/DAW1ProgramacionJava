package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 16
 *
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utiliza
 * el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
 * del programa.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej16_IfCortoTestFidelidad {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int puntuacion = 0;
    char linea;

    System.out.println("Contesta con v las verdaderas y con f las falsas.");

    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin "
            + "ningún motivo aparente. ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    // Versión normal de un if
    // if (linea == 'v') {
    //   puntuacion += 3;
    // }

    // Versión corta de un if. En primer lugar se pone la condición y tras el
    // interrogante van el resultado verdadero y después el resultado falso.
    // La comparativa con una variable de tipo char debe ser con == y además no
    // se pueden usar las comillas dobles (") ya que se interpreta como string, 
    // en su lugar se usan comillas simples (').
    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("2. Ha aumentado sus gastos de vestuario. ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("3. Ha perdido el interés que mostraba anteriormente "
            + "por ti. ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es "
            + "hombre) o ahora se arregla el pelo y se asea con más frecuencia "
            + "(si es mujer). ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("5. No te deja que mires la agenda de su teléfono móvil. ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("6. A veces tiene llamadas que dice no querer contestar "
            + "cuando estás tú delante. ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o "
            + "estar bronceado/a. ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("8. Muchos días viene tarde después de trabajar porque "
            + "dice tener mucho más trabajo. ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("9. Has notado que últimamente se perfuma más. ");
    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.print("10. Se confunde y te dice que ha estado en sitios donde "
            + "no ha ido contigo. ");

    linea = sc.next().toLowerCase().trim().charAt(0);

    puntuacion += ((linea == 'v') ? 3 : 0);

    System.out.println("\nTu puntuación es: " + puntuacion + "/30");

    if ((puntuacion >= 0) && (puntuacion <= 10)) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if ((puntuacion >= 11) && (puntuacion <= 22)) {
      System.out.println("Quizás exista el peligro de otra persona en su vida o "
              + "en su mente, aunque seguramente será algo sin importancia. "
              + "No bajes la guardia.");
    } else {
      System.out.println("Tu pareja tiene todos los ingredientes para estar "
              + "viviendo un romance con otra persona. Te aconsejamos que "
              + "indagues un poco más y averigües que es lo que está pasando "
              + "por su cabeza.");
    }
  }
}
