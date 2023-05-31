/**
 * Clase que implementa el tipo de metralleta
 */

public class Metralleta implements Arma{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de metralleta
   */

  @Override public void creaArma(){

    nombre = "Metralleta";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de la metralleta
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }
  /**
   *Metodo que nos regresa la velocidad de la metralleta
   * @return velocidad de la metralleta
   */

  @Override public int getVelocidad(){

    return 0;

  }

  /**
   * Metodo que nos regresa el ataque de la metralleta
   * @return ataque de la metralleta
   */

  @Override public int getAtaque(){

    return 40;

  }

  /**
   * Metodo que nos regresa la defensa de la metrallea
   * @return la defensa de la metralleta
   */

  @Override public int getDefensa(){
    return 0;

  }

  /**
   * Metodo que nos regresa el costo del arpon
   * @return el costo del arpon
   */

  @Override public int getCosto(){
    
    return 15000;
  }

}
