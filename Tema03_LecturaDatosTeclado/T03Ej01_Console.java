package Tema03_LecturaDatosTeclado;

/**
 * Tema 3 Ejercicio 1
 *
 * Realiza un programa que pida dos números y que luego muestre el resultado de
 * su multiplicación.
 *
 * NOTA: Esta solución solo funciona en consola/terminal del SO, no de IDEs.
 * 
 * @author Javier Roviralta Terrón
 */
public class T03Ej01_Console {

  public static void main(String[] args) {

    String linea;
    int num1;
    int num2;
    int total;

    System.out.print("Por favor, introduce un número (entero): ");

    // Recoge la cadena obtenida con la función .readLine()
    linea = System.console().readLine();

    // Recoge la cadena linea convirtiéndola en número entero con la función
    // .parseInt() de la clase Integer
    num1 = Integer.parseInt(linea);

    System.out.print("introduce otro número (entero), por favor: ");

    // Se puede anidar el código, quedando así:
    // num2 = Integer.parseInt(System.console().readLine());
    linea = System.console().readLine();

    num2 = Integer.parseInt(linea);

    total = num1 * num2;

    System.out.println("El resultado de la multiplicación de "
            + num1 + " * " + num2 + " es: " + total);
  }
}
