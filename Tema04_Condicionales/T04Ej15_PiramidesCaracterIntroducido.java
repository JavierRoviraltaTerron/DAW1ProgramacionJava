package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 15
 *
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un símbolo como
 * *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú
 * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo,
 * hacia la izquierda o hacia la derecha.
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej15_PiramidesCaracterIntroducido {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // El tipo char solo recoge un caracter.
    char c;
    int seleccion;

    System.out.print("Introduce el caracter que forma la pirámide: ");

    // La función .next() recoge lo que se introduce sin especificar tipo.
    // La función .trim() elimina los espacios en blanco introducidos.
    // La función .charAt(n) recoge el caracter de la posición n de la cadena.
    c = sc.next().trim().charAt(0);

    System.out.println("Elige la dirección de la pirámide: ");
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Izquierda");
    System.out.println("4. Derecha");
    System.out.print("Selección: ");

    seleccion = sc.nextInt();

    switch (seleccion) {
      case 1:
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c + " " + c);
        System.out.println(c + " " + c + " " + c + " " + c + " " + c);
        break;

      case 2:
        System.out.println(c + " " + c + " " + c + " " + c + " " + c);
        System.out.println("  " + c + " " + c + " " + c);
        System.out.println("    " + c);
        break;

      case 3:
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println("  " + c + " " + c);
        System.out.println("    " + c);
        break;

      case 4:
        System.out.println(c + "    ");
        System.out.println(c + " " + c + "  ");
        System.out.println(c + " " + c + " " + c);
        System.out.println(c + " " + c + "  ");
        System.out.println(c + "    ");
        break;

      default:
        System.out.println("Elige una opción válida.");
        break;
    }
  }
}
