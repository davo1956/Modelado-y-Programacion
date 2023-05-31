/**
 * Clase que implementa el tipo de llanta deportiva
 */

public class LlantaOff implements Llanta{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de llanta off road
   */

  @Override public void creaLlanta(){
    nombre = "Llantas off road";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de llanta
   */

  @Override public void getNombre(){
    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad de la llanta 
   * @return velocidad de la llanta
   */

  @Override public int getVelocidad(){
    return 5;

  }

  /**
   * Metodo que nos regresa el ataque de la llanta
   * @return ataque de la llanta
   */

  @Override public int getAtaque(){
    return 0;

  }

  /**
   * Metodo que nos regresa la defensa de la llanta
   * @return la defensa de la llanta
   */

  @Override public int getDefensa(){
    return 0;

  }

  /**
   * Metodo que nos regresa el costo de la llanta
   * @return el costo de la llanta
   */

  @Override public int getCosto(){
    return 7500;
  }
}
