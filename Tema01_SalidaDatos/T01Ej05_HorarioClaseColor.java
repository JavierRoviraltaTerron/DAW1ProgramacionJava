package Tema01_SalidaDatos;

/**
 * Tema 1 Ejercicio 5
 *
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada 
 * asignatura de un color diferente.
 *
 * @author Javier Roviralta Terrón
 */
public class T01Ej05_HorarioClaseColor {

  public static void main(String[] args) {

    System.out.println("");
    System.out.println("1ºDAW\tLunes\tMartes\tMierc\tJueves\tViernes");
    System.out.println("08:15\t" + "\033[34m" + "Prog\tProg\tProg\t" 
            + "\033[33m" + "SisInf\t" + "\033[35m" + "BBDD" + "\033[30m");
    System.out.println("09:15\t" + "\033[34m" + "Prog\tProg\tProg\t" 
            + "\033[33m" + "SisInf\t" + "\033[35m" + "BBDD" + "\033[30m");
    System.out.println("10:15\t" + "\033[34m" + "Prog\t" + "\033[31m" + "LM\t" 
            + "\033[34m" + "Prog\t" + "\033[33m" + "SisInf\t" + "\033[35m" 
            + "BBDD" + "\033[30m");
    System.out.println("11:15\t\t\tRecreo");
    System.out.println("11:45\t" + "\033[36m" + "FOL\t" + "\033[32m" + "ED\t" 
            + "\033[35m" + "BBDD\t" + "\033[31m" + "LM\t" + "\033[33m" 
            + "SisInf" + "\033[30m");
    System.out.println("12:45\t" + "\033[36m" + "FOL\t" + "\033[32m" + "ED\t" 
            + "\033[35m" + "BBDD\t" + "\033[31m" + "LM\t" + "\033[33m" 
            + "SisInf" + "\033[30m");
    System.out.println("13:45\t" + "\033[36m" + "FOL\t" + "\033[32m" + "ED\t" 
            + "\033[35m" + "BBDD\t" + "\033[31m" + "LM\t" + "\033[33m" 
            + "SisInf" + "\033[30m");
    System.out.println("");
  }
}
