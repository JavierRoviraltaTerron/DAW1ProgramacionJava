package Tema03_LecturaDatosTeclado;

import java.util.Scanner;

/**
 * Tema 3 Ejercicio 7
 *
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * @author Javier Roviralta Terrón
 */
public class T03Ej07_PrecioConIVA {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double baseImp;
    int iva = 21;
    double ivaCalculado;
    double total;
    
    System.out.print("Introduce la base imponible: ");
    
    baseImp = sc.nextDouble();
    
    ivaCalculado = (baseImp * iva) / 100;
    
    total = baseImp + ivaCalculado;
    
    System.out.printf("\nBase imponible:\t%.2f€\n", baseImp);
    System.out.print("IVA (" + iva + "%):\t");
    System.out.printf("%.2f€\n", ivaCalculado);
    System.out.printf("Total factura:\t%.2f€\n", total);
  }
}
