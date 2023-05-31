/**
 * Clase que implementa el tipo de carroceria camion
 */

public class CarroceriaCamion implements Carroceria{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de carroceria camion
   */

  @Override public void creaCarroceria(){

    nombre = "Carroceria camion";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de carroceria camion
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad de la carroceri camion
   * @return velocidad de la carroceria camion
   */

  @Override public int getVelocidad(){

    return -10;

  }

  /**
   * Metodo que nos regresa el ataque de la carroceria camion
   * @return ataque de la carroceria camion
   */

  @Override public int getAtaque(){

    return 0;

  }

  /**
   * Metodo que nos regresa la defensa de la carroceri simple
   * @return la defensa de la carroceria simple
   */

  @Override public int getDefensa(){

    return 7;

  }

  /**
   * Metodo que nos regresa el costo de la carrosa camion
   * @return el costo de la carroceria camion
   */

  @Override public int getCosto(){

    return 60000;

  }

  
}
