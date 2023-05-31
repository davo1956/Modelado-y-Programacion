/**
 * Clase que implementa el tipo de blindaje simple
 */

public class BlindajeSimple implements Blindaje{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de blindaje simple
   */

  @Override public void creaBlindaje(){

    nombre = "Blindaje simple";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de blindaje simple
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad del blindaje simple
   * @return velocidad del blindaje simple
   */

  @Override public int getVelocidad(){

    return 0;

  }

  /**
   * Metodo que nos regresa el ataque del blindaje simple
   * @return ataque del blindaje simple
   */

  @Override public int getAtaque(){

    return 0;

  }

  /**
   * Metodo que nos regresa la defensa del blindaje simple
   * @return la defensa del blindaje simple
   */

  @Override public int getDefensa(){

    return 40;

  }

  /**
   * Metodo que nos regresa el costo del blindaje simple
   * @return el costo del blindaje simple
   */

  @Override public int getCosto(){

    return 100000;

  }

  
}
