package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 1
 *
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej01_SwitchPrimeraHora {

  public static void main(String[] args) {

    // Haciendo que esta instancia de la clase Scanner use esta codificación
    // se consigue que almacene los caracteres especiales, como tildes o ñ
    Scanner sc = new Scanner(System.in, "ISO-8859-1");
    String dia;

    System.out.print("Por favor, introduzca un día de la semana: ");

    // La función .toLowercase() convierte a minúsculas la cadena recogida por 
    // teclado, para hacer que coincida con los casos en el switch
    dia = sc.nextLine().toLowerCase();

    // Cada caso se termina en el siguiente break, de modo que si un caso no 
    // tiene, se rompe el programa en el siguiente, por lo que el código del 
    // siguiente caso también se ejecuta
    switch (dia) {
      // Se pueden agrupar varios casos antes del break para ahorrar código, si
      // el contenido es el mismo
      case "lunes":
      case "martes":
      case "miercoles":
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Sistemas informáticos");
        break;
      case "viernes":
        System.out.println("Bases de datos");
        break;
      case "sabado":
      case "sábado":
      case "domingo":
        System.out.println("No hay clase");
        break;
      default:
        System.out.println("El día introducido no existe o no ha sido "
                + "introducido correctamente.");
        break;
    }
  }
}
