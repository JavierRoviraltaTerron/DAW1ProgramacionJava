package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 12
 *
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay que
 * tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo
 * examen un 60%.
 *
 * Ejemplo 1: Introduce la nota del primer examen: 7 ¿Qué nota quieres sacar en
 * el trimestre? 8.5 Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en
 * el segundo examen.
 *
 * Ejemplo 2: Introduce la nota del primer examen: 8 ¿Qué nota quieres sacar en
 * el trimestre? 7 Para tener un 7 en el trimestre necesitas sacar un 6.33 en el
 * segundo examen.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej12_MediaDeseadaNotas {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double notaPrimerExamen;
    double pesoPrimerExamen = 40;
    double notaSegundoExamen;
    double pesoSegundoExamen = 60;
    double notaMediaDeseada;

    System.out.print("Introduce la nota del primer examen: ");

    notaPrimerExamen = sc.nextDouble();
    
    System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
    
    notaMediaDeseada = sc.nextDouble();
    
    // Para resolver la nota del segundo examen se resuelve la incógnita en una
    // ecuación sobre la fórmula de la media ponderada:
    // mediaPonderada = ((notaPrimerExamen * pesoPrimerExamen) 
    // + (notaSegundoExamen * pesoSegundoExamen)) / (pesoPrimerExamen + pesoSegundoExamen);
    
    // Esta es la ecuación de media ponderada preparada para resolver la incógnita
    // de la nota del segundo examen
    notaSegundoExamen = ((notaMediaDeseada * (pesoPrimerExamen + pesoSegundoExamen) 
            - (notaPrimerExamen * pesoPrimerExamen)) / pesoSegundoExamen);

    System.out.printf("Para tener un %.1f en el trimestre necesitas sacar un "
            + "%.1f en el segundo examen.\n", notaMediaDeseada, notaSegundoExamen);
  }
}
