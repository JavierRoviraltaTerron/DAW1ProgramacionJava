package Tema02_Variables;

/**
 * Tema 2 Ejercicio 1
 *
 * Escribe un programa en el que se declaren las variables enteras x e y .
 * Asignales los valores 144 y 999 respectivamente. A continuación, muestra por
 * pantalla el valor de cada variable, la suma, la resta, la división y la
 * multiplicación.
 *
 * @author Javier Roviralta Terrón
 */
public class T02Ej01_OperacionesMatematicas {

  public static void main(String[] args) {
    
    int x;
    int y;
    
    x = 144;
    y = 999;
    
    System.out.println("El valor de x es " + x);
    System.out.println("El valor de y es " + y);
    System.out.println("La suma de x + y da " + (x + y));
    System.out.println("La resta de x - y da " + (x - y));
    System.out.println("La multiplicación de x * y da " + (x * y));
    System.out.println("La división de x / y da " + (x / y));
  }
}
