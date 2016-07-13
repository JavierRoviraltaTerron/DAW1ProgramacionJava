package Tema02_Variables;

/**
 * printf
 *
 * @author Javier Roviralta Terrón
 */
public class Printf {

  public static void main(String[] args) {
    
    int entero = 10;
    double decimal = 0.123;
    int largo = 1234567;
    
    // Con printf se  colocan las variables, seguidas de la cantidad de espacios
    // reservados a cada una, y se les asigna el valor a continuación de la 
    // cadena de caracteres en el mismo orden de aparición.
    // variable %Xd -> la variable tiene reservados X espacios para.
    // variable %X.Yf -> la variable tiene reservados X espacios enteros e Y 
    // espacios para decimales.
    System.out.printf("entero %6d decimal %6.2f largo %8d\n", entero, decimal, largo);
    System.out.printf("entero %6d decimal %6.2f largo %8d\n", 24, 20.789, 234);
  }
}
