/**
 * Clase que implementa el tipo de carroceria casual
 */

public class CarroceriaCasual implements Carroceria{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de carroceria casual
   */

  @Override public void creaCarroceria(){

    nombre = "Carroceria casual";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de carroceria casual
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad de la carroceria casual
   * @return velocidad de la carroceria casual
   */

  @Override public int getVelocidad(){
    return -5;
  }

  /**
   * Metodo que nos regresa el ataque de la carroceria casual
   * @return ataque de la carroceria casual
   */

  @Override public int getAtaque(){

    return 0;

  }

  /**
   * Metodo que nos regresa la defensa de la carroceria casual
   * @return la defensa de la carroceria casual
   */


  @Override public int getDefensa(){

    return 3;

  }

  /**
   * Metodo que nos regresa el costo de la carroceria casual
   * @return el costo de la carroceria casual
   */

  @Override public int getCosto(){

    return 20000;

  }

  
}
