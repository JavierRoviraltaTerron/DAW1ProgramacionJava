package Tema02_Variables;

/**
 * Tema 2 Ejercicio 6
 *
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 *
 * @author Javier Roviralta Terrón
 */
public class T02Ej06_PrecioConIVA {

  public static void main(String[] args) {

    double baseImp = 500;
    int iva = 21;
    double ivaCalculado = (baseImp * iva) / 100;
    double total = baseImp + ivaCalculado;

    System.out.printf("Base imponible:\t%.2f€\n", baseImp);
    System.out.print("IVA (" + iva + "%):\t");
    System.out.printf("%.2f€\n", ivaCalculado);
    System.out.printf("Total factura:\t%.2f€\n", total);
  }
}
