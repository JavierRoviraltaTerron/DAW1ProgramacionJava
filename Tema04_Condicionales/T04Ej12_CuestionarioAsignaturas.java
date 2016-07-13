package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 12
 *
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el
 * minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal
 * andan de conocimientos en las diferentes asignaturas del curso.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej12_CuestionarioAsignaturas {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String respuesta;
    int puntuacion = 0;

    System.out.println("1.¿Cómo se llama el profesor de Programación?");
    System.out.println("a)Luis\t b)Romualdo\t c)Amadeo");

    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("luis")) {
      // Añade 1 al valor de puntuación. Es la versión corta de puntuacion++
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("2.¿En qué módulo se trata la seguridad laboral?(siglas)");

    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("fol")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("3.¿Qué software de Microsoft utilizamos para DED?");
    
    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("visio")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("4.¿Cómo se llama la profesora de BBDD?");
    
    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("eva")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("5.¿Qué tipo de aplicación utilizamos para programar Java?");

    respuesta = sc.nextLine().toLowerCase();
    
    if (respuesta.equals("ide")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("6.¿En qué módulo estudiamos la Métrica v3?(siglas)");
    
    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("ed")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("7.¿En qué asignatura estudiamos los componentes del pc?(siglas)");
    
    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("si")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("8.¿Qué lenguaje de marcas se parece a html pero más estricto?");
    
    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("xhtml")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("9.¿Qué distribución de Linux es la más popular actualmente?");
    
    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("ubuntu")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("10.¿Qué tipo de memoria sirve para arrancar el PC?");
    
    respuesta = sc.nextLine().toLowerCase();

    if (respuesta.equals("rom")) {
      puntuacion++;
      System.out.println("¡Correcto!");
    } else {
      System.out.println("¡Incorrecto!");
    }

    System.out.println("¡Tu puntuación es: " + puntuacion + "/10!");
  }
}
