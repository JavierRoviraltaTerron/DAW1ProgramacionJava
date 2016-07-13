package Tema02_Variables;

/**
 * Tema 2 Ejercicio 4
 *
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 *
 * @author Javier Roviralta Terrón
 */
public class T02Ej04_ConversorEurosPesetas {

  public static void main(String[] args) {
    
    double euros = 10;
    int pesetasPorCadaEuro = 166;
    double resultado = euros * pesetasPorCadaEuro;
    
    System.out.println(euros + "€ son " + (int) resultado + "pts");
  }
}
