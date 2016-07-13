package Tema04_Condicionales;

import java.util.Scanner;

/**
 * Tema 4 Ejercicio 23
 *
 * Escribe un programa que calcule el precio final de un producto según su base
 * imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si
 * se muestran los valores correctos, aunque los números no estén tabulados.
 *
 * Ejemplo: Introduzca la base imponible: 25 Introduzca el tipo de IVA (general,
 * reducido o superreducido): reducido Introduzca el código promocional (nopro,
 * mitad, meno5 o 5porc): mitad Base imponible 25.00 IVA (10%) 2.50 Precio con
 * IVA 27.50 Cód. promo. (mitad): -13.75 TOTAL 13.75
 *
 * @author Javier Roviralta Terrón
 */
public class T04Ej23_PrecioIVAPromocion {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double baseImp;
    String tipoIva;
    int iva = 0;
    double ivaCalculado;
    String codPromo;
    double precioConIva;
    double promo = 0;
    double total;

    System.out.print("Introduzca la base imponible: ");

    baseImp = sc.nextDouble();

    System.out.print("Introduzca el tipo de iva (general, reducido o "
            + "superreducido): ");

    tipoIva = sc.next();

    switch (tipoIva) {
      case "general":
        iva = 21;
        break;
      case "reducido":
        iva = 10;
        break;
      case "superreducido":
        iva = 4;
        break;
      default:
        System.out.println("Tipo de IVA incorrecto.");
        System.exit(0);
    }

    ivaCalculado = (baseImp * iva) / 100;

    precioConIva = baseImp + ivaCalculado;

    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 "
            + "o 5porc): ");

    codPromo = sc.next();

    switch (codPromo) {
      case "nopro":
        promo = 0;
        break;
      case "mitad":
        promo = precioConIva / 2;
        break;
      case "meno5":
        promo = 5;
        break;
      case "5porc":
        promo = (precioConIva * 5) / 100;
        break;
      default:
        System.out.println("Código de promoción incorrecto.");
        System.exit(0);
    }

    total = precioConIva - promo;

    System.out.printf("\nBase imponible:\t\t%.2f€\n", baseImp);
    System.out.print("IVA (" + iva + "%):\t\t");
    System.out.printf("%.2f€\n", ivaCalculado);
    System.out.printf("Precio con IVA:\t\t%.2f€\n", precioConIva);
    System.out.print("Cód.Promo. (" + codPromo + "):\t");
    System.out.printf("-%.2f€\n", promo);
    System.out.printf("Total factura:\t\t%.2f€\n", total);
  }
}
