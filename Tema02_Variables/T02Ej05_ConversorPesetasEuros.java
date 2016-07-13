package Tema02_Variables;

/**
 * Tema 2 Ejercicio 5
 *
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 *
 * @author Javier Roviralta Terrón
 */
public class T02Ej05_ConversorPesetasEuros {

  public static void main(String[] args) {
    
    int pesetas = 1000;
    int pesetasPorCadaEuro = 166;
    double resultado = pesetas / pesetasPorCadaEuro;
    
    System.out.println(pesetas + "pts son " + resultado + "€");
  }
}
