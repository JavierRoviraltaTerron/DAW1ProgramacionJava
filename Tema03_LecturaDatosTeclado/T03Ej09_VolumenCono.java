package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 9
 *
 * Escribe un programa que calcule el volumen de un cono según la 
 * fórmula V = 1/3*π*r²*h
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej09_VolumenCono {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double radio;
    double altura;
    double volumen;
    
    System.out.print("Introduce el radio: ");
    
    radio = sc.nextDouble();
    
    System.out.print("Introduce la altura: ");
    
    altura = sc.nextDouble();
    
    // La librería Math viene por defecto, no requiere ser importada
    volumen = (Math.PI * Math.pow(radio,2) * altura) / 3;
    
    // Alternativa al uso de las funciones de Math
    //volumen = (3.14 * (radio * radio) * altura) / 3;

    // La elevación al cubo se consigue con el código Unicode del caracter
    System.out.printf("El volumen es %.2fm\u00B3\n", volumen);
  }
}
