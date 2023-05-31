/**
 * Clase que implementa el tipo de blindaje tanque
 */
public class BlindajeTanque implements Blindaje{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de blindaje tanque
   */

  @Override public void creaBlindaje(){

    nombre = "Blindaje tanque";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de blindaje tanque
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad del blindaje tanque
   * @return velocidad del blindaje tanque
   */

  @Override public int getVelocidad(){

    return -15;

  }

  /**
   * Metodo que nos regresa el ataque del blindaje tanque
   * @return ataque del blindaje tanque
   */

  @Override public int getAtaque(){

    return 0;

  }

  /**
   * Metodo que nos regresa la defensa del blindaje tanque
   * @return la defensa del blindaje tanque
   */

  @Override public int getDefensa(){

    return 100;

  }

  /**
   * Metodo que nos regresa el costo del blindaje tanque
   * @return el costo del blindaje tanque
   */

  @Override public int getCosto(){

    return 250000;

  }

  
}
