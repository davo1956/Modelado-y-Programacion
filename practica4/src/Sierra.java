/**
 * Clase que implementa el tipo de sierra
 */

public class Sierra implements Arma{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de sierra
   */

  @Override public void creaArma(){

    nombre = "Sierra";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de sierra
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad de la sierra
   * @return velocidad de la sierra
   */

  @Override public int getVelocidad(){

    return 0;

  }

  /**
   * Metodo que nos regresa el ataque de la sierra
   * @return ataque de la sierra
   */

  @Override public int getAtaque(){

    return 30;

  }

  /**
   * Metodo que nos regresa la defensa de la sierra
   * @return la defensa de la sierra
   */

  @Override public int getDefensa(){

    return 0;

  }

  /**
   * Metodo que nos regresa el costo de la sierra
   * @return el costo de la sierra
   */

  @Override public int getCosto(){

    return 7500;

  }

  

}
