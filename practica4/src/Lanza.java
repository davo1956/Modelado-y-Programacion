/**
 * Clase que implementa el tipo de lanza
 */

public class Lanza implements Arma{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de lanza
   */

  @Override public void creaArma(){

    nombre = "Lanza";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de lanza
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad de la lanza
   * @return velocidad de la lanza
   */

  @Override public int getVelocidad(){

    return 0;

  }

  /**
   * Metodo que nos regresa el ataque de la lanza
   * @return ataque de la lanza
   */

  @Override public int getAtaque(){

    return 5;

  }

  /**
   * Metodo que nos regresa la defensa de la lanza
   * @return la defensa de la lanza
   */

  @Override public int getDefensa(){

    return 0;

  }

  /**
   * Metodo que nos regresa el costo de la lanza
   * @return el costo de la lanza
   */

  @Override public int getCosto(){

    return 1500;

  }
  

}
