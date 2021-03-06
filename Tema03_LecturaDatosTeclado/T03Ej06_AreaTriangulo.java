package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 6
 *
 * Escribe un programa que calcule el área de un triángulo.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej06_AreaTriangulo {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double base;
    double altura;
    double area;
    
    System.out.print("Introduce el tamaño de la base: ");
    
    base = sc.nextDouble();
    
    System.out.print("Introduce el tamaño de la altura: ");
    
    altura = sc.nextDouble();
    
    area = (base * altura) / 2;
    
    System.out.printf("El area del triángulo es: %.2fm\u00B2\n", area);
  }
}
