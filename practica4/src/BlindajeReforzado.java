/**
 * Clase que implementa el tipo de blindaje reforzado
 */

public class BlindajeReforzado implements Blindaje{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de blindaje reforzado
   */

  @Override 
  public void creaBlindaje(){

    nombre = "Blindaje reforzado";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de blindaje reforzado
   */


  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad del blindaje reforzado
   * @return velocidad del blindaje reforzado
   */

  @Override public int getVelocidad(){

    return -5;

  }

  /**
   * Metodo que nos regresa el ataque del blindaje reforzado
   * @return ataque del blindaje reforzado
   */

  @Override public int getAtaque(){

    return 0;

  }

  /**
   * Metodo que nos regresa la defensa del blindaje reforzado
   * @return la defensa del blindaje reforzado
   */

  @Override public int getDefensa(){

    return 75;

  }

  /**
   * Metodo que nos regresa el costo del blindaje reforzado
   * @return el costo del blindaje reforzado
   */

  @Override public int getCosto(){

    return 175000;

  }


}
