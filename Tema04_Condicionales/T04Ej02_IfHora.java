package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 2
 *
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta
 * las horas, los minutos no se deben introducir por teclado.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej02_IfHora {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int hora;
    
    System.out.print("Por favor, introduzca una hora del día (sin minutos): ");
    
    hora = sc.nextInt();

    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("¡Buenos días!");
    } else if ((hora >= 13) && (hora <= 20)) {
      System.out.println("¡Buenas tardes!");
    } else if (((hora >= 21) && (hora <= 23)) || ((hora >= 0) && (hora <= 5))) {
      System.out.println("¡Buenas noches!");
    } else {
      System.out.println("La hora introducida no es correcta.");
    }
  }
}
