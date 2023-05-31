/**
 * Clase que implementa el tipo de arpon
 */
public class Arpon implements Arma{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de arpon
   */

  @Override public void creaArma(){

    nombre = "Arpón";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de arpon
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad del arpon
   * @return velocidad del arpon
   */

  @Override public int getVelocidad(){

    return 0;

  }

  /**
   * Metodo que nos regresa el ataque del arpon
   * @return ataque del arpon
   */

  @Override public int getAtaque(){

    return 10;

  }

  /**
   * Metodo que nos regresa la defensa del arpon
   * @return la defensa del arpon
   */

  @Override public int getDefensa(){

    return 0;

  }

  /**
   * Metodo que nos regresa el costo del arpon
   * @return el costo del arpon
   */

  @Override public int getCosto(){

    return 3000;

  }
  

}
