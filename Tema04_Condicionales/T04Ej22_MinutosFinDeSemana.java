package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 22
 *
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * horas (horass y minutoss), calcule cuántos minutoss faltan para el fin de
 * semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
 * Se da por hecho que el usuario introducirá un día y horas correctos, anterior
 * al viernes a las 15:00h.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej22_MinutosFinDeSemana {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in, "ISO-8859-1");
    String dia;
    int horas = 0;
    int minutos = 0;
    int totalMinutos = 0;

    System.out.print("Introduce un día de la semana: ");

    dia = sc.nextLine().trim().toLowerCase();

    // Se suman todos los minutos entre el día introducido y el viernes a las 15:00
    switch (dia) {
      case "lunes":
        totalMinutos += 1440;
      case "martes":
        totalMinutos += 1440;
      case "miercoles":
        totalMinutos += 1440;
      case "miércoles":
        // Controla que solo se suman los minutos si se introduce expresamente 
        // el día con tilde
        totalMinutos += (dia.equals("miércoles")) ? 1440 : 0;
      case "jueves":
        totalMinutos += 1440;
      case "viernes":
        totalMinutos += 900;
        break;
      default:
        System.out.println("El día introducido no es válido.");
        // Controla que el día introducido es válido
        // Con System.exit(0) se fuerza el fín de la ejecución del programa.
        System.exit(0);
    }

    System.out.print("Introduce las horas: ");

    horas = sc.nextInt();

    // Controla que las horas introducidas son válidas
    if (!((horas >= 0) && (horas <= 23))
            || (dia.equals("viernes") && !((horas >= 0) && (horas <= 15)))) {
      System.out.println("La hora introducida no es válida.");
      System.exit(0);
    }

    System.out.print("Introduce los minutos: ");

    minutos = sc.nextInt();

    // Controla que los minutos introducidos son válidos
    if (!((minutos >= 0) && (minutos <= 59))
            || (dia.equals("viernes") && !((horas >= 0) && ((horas < 15)
            || ((horas == 15) && (minutos == 0)))))) {
      System.out.println("Los minutos introducidos no son válidos.");
      System.exit(0);
    }

    // Se restan los minutos que ya han pasado en el día introducido.
    totalMinutos -= (horas * 60) + minutos;

    System.out.println("Faltan " + totalMinutos + " minutos para el fin de semana.");
  }
}
