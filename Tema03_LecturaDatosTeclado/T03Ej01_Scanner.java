package Tema03_LecturaDatosTeclado;

// Importa la clase Scanner
import java.util.Scanner;

/**
 * Tema 3 Ejercicio 1
 *
 * Realiza un programa que pida dos números y que luego muestre el resultado de
 * su multiplicación.
 *
 * NOTA: Esta solución funciona tanto en consola/terminal del SO como de IDEs.
 * 
 * @author Javier Roviralta Terrón
 */
public class T03Ej01_Scanner {

  public static void main(String[] args) {

    // Crea un nuevo objeto de la clase Scanner que sirve para leer datos
    // introducidos por teclado
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int total;

    System.out.print("Por favor, introduce un número entero: ");

    // Recoge el número entero obtenido con la función .nextInt() del objeto sc
    num1 = sc.nextInt();

    System.out.print("introduce otro número entero, por favor: ");

    num2 = sc.nextInt();

    total = num1 * num2;

    System.out.println("El resultado de la multiplicación de "
            + num1 + " * " + num2 + " es: " + total);
  }
}
