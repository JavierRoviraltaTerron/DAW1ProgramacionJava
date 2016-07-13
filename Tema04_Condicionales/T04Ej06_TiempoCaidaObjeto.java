package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 6
 *
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Ver fórmula en pdf.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej06_TiempoCaidaObjeto {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double h;
    double g = 9.81;
    double t;

    System.out.print("Introduce la altura: ");

    h = sc.nextDouble();

    t = Math.sqrt((2 * h) / g);

    if (h < 0) {
      System.out.println("Esta raíz cuadrada no tiene solución, puesto que la altura no puede ser menor de 0.");
    } else {
      System.out.println("t = " + t + "m/s");
    }
  }
}
