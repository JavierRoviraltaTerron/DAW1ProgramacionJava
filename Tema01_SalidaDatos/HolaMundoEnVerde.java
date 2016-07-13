package Tema01_SalidaDatos;

/**
 * ¡Hola Mundo en verde!
 *
 * @author Javier Roviralta Terrón
 */
public class HolaMundoEnVerde {

  public static void main(String[] args) {

    System.out.println("\033[32m" + "¡Hola\tmundo!");
    System.out.println("Estoy\tprogramando\nen\tjava" + "\033[37m");
    System.out.println("Casa\tcoche\tmoto");
  }
}
