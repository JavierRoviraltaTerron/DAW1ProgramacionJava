package Tema01_SalidaDatos;

/**
 * Tema 1 Ejercicio 9
 *
 * Escribe un programa que pinte por pantalla alguna escena - el campo, la
 * habitación de una casa, un aula, etc. - o algún objeto animado o inanimado-
 * un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
 * caracteres como *, +, <, #, @, etc. ¡Échale imaginación!
 *
 * @author Javier Roviralta Terrón
 */
public class T01Ej09_DibujoCocheColor {

  public static void main(String[] args) {

    System.out.println("");
    System.out.println(" \t \t \t#\t#\t#\t#\t \t ");
    System.out.println(" \t \t" + "\033[34m" + "#\t#\t#" + "\033[30m" + "\t " + "\033[34m" + "\t#\t#" + "\033[30m" + "\t ");
    System.out.println("\033[35m" + "@" + "\033[30m" + "\t#\t \t \t \t \t \t \t" + "\033[31m" + "@" + "\033[30m");
    System.out.println("#\t \t \t \t \t \t \t \t#");
    System.out.println("#\t#" + "\033[33m" + "\t*\t*" + "\033[30m" + "\t#\t#" + "\033[33m" + "\t*\t*" + "\033[30m" + "\t#");
    System.out.println(" \t " + "\033[33m" + "\t*\t*" + "\033[30m" + " \t \t " + "\033[33m" + "\t*\t*" + "\033[30m");
    System.out.println("");
  }
}
