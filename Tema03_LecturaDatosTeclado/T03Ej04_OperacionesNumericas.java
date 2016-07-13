package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 4
 *
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej04_OperacionesNumericas {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    System.out.print("Por favor, introduce un número entero: ");
    
    num1 = sc.nextInt();
    
    System.out.print("Por favor, introduce otro número entero: ");
    
    num2 = sc.nextInt();
    
    suma = num1 + num2;
    resta = num1 - num2;
    multiplicacion = num1 * num2;
    division = num1 / num2;
    
    System.out.println(num1 + " + " + num2 + " = " + suma);
    System.out.println(num1 + " - " + num2 + " = " + resta);
    System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
    System.out.println(num1 + " / " + num2 + " = " + division);
  }
}
