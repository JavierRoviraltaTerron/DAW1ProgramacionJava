package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 10
 *
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej10_FechaHoroscopo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int dia;
    int mes;
    
    System.out.print("Introduce el número de día de tu cumpleaños: ");
    
    dia = sc.nextInt();
    
    if ((dia < 1) || (dia > 31)) {
      System.out.println("No existe ese día.");
    } else {
      System.out.print("Introduce el número de mes de tu cumpleaños: ");
      
      mes = sc.nextInt();
      
      if ((mes < 1) || (mes > 12)) {
        System.out.println("No existe ese mes.");
      } else {

        switch (mes) {
          case 1:
            if ((dia >= 1) && (dia < 19)) {
              System.out.println("Eres Capricornio");
            } else if ((dia >= 19) && (dia <= 31)) {
              System.out.println("Eres Acuario");
            }
            break;
          case 2:
            if ((dia >= 1) && (dia < 18)) {
              System.out.println("Eres Acuario");
            } else if ((dia >= 18) && (dia <= 29)) {
              System.out.println("Eres Piscis");
            }
            break;
          case 3:
            if ((dia >= 1) && (dia < 20)) {
              System.out.println("Eres Piscis");
            } else if ((dia >= 20) && (dia <= 31)) {
              System.out.println("Eres Aries");
            }
            break;
          case 4:
            if ((dia >= 1) && (dia < 20)) {
              System.out.println("Eres Aries");
            } else if ((dia >= 20) && (dia <= 30)) {
              System.out.println("Eres Tauro");
            }
            break;
          case 5:
            if ((dia >= 1) && (dia < 21)) {
              System.out.println("Eres Tauro");
            } else if ((dia >= 21) && (dia <= 31)) {
              System.out.println("Eres Géminis");
            }
            break;
          case 6:
            if ((dia >= 1) && (dia < 21)) {
              System.out.println("Eres Géminis");
            } else if ((dia >= 21) && (dia <= 30)) {
              System.out.println("Eres Cáncer");
            }
            break;
          case 7:
            if ((dia >= 1) && (dia < 23)) {
              System.out.println("Eres Cáncer");
            } else if ((dia >= 23) && (dia <= 31)) {
              System.out.println("Eres Leo");
            }
            break;
          case 8:
            if ((dia >= 1) && (dia < 23)) {
              System.out.println("Eres Leo");
            } else if ((dia >= 23) && (dia <= 31)) {
              System.out.println("Eres Virgo");
            }
            break;
          case 9:
            if ((dia >= 1) && (dia < 23)) {
              System.out.println("Eres Virgo");
            } else if ((dia >= 23) && (dia <= 30)) {
              System.out.println("Eres Libra");
            }
            break;
          case 10:
            if ((dia >= 1) && (dia < 23)) {
              System.out.println("Eres Libra");
            } else if ((dia >= 23) && (dia <= 31)) {
              System.out.println("Eres Escorpio");
            }
            break;
          case 11:
            if ((dia >= 1) && (dia < 22)) {
              System.out.println("Eres Escorpio");
            } else if ((dia >= 22) && (dia <= 30)) {
              System.out.println("Eres Sagitario");
            }
            break;
          case 12:
            if ((dia >= 1) && (dia < 22)) {
              System.out.println("Eres Sagitario");
            } else if ((dia >= 22) && (dia <= 31)) {
              System.out.println("Eres Capricornio");
            }
            break;
        }
      }
    }
  }
}
