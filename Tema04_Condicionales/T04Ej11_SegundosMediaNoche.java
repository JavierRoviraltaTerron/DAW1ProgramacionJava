package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 11
 *
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej11_SegundosMediaNoche {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int h;
    int m;
    int s;

    System.out.print("Introduce las horas: ");

    h = sc.nextInt();

    if ((h < 1) || (h > 23)) {
      System.out.println("Introduce un número de horas válido.");
    } else {
      System.out.print("Introduce los minutos: ");

      m = sc.nextInt();

      if ((m < 1) || (m > 59)) {
        System.out.println("Introduce un número de minutos válido.");
      } else {
        s = 86400 - ((h * 60 * 60) + (m * 60));
        
        System.out.println("Faltan " + s + "\" para media noche.");
      }
    }
  }
}
