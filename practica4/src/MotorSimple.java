/**
 * Clase que implementa el tipo de motor simple
 */

public class MotorSimple implements Motor{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de motor simple
   */

  @Override public void creaMotor(){

    nombre = "Motor simple";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de motor simple
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad del motor simple
   * @return velocidad del motor simple
   */

  @Override public int getVelocidad(){

    return 30;

  }

  /**
   * Metodo que nos regresa el ataque del motor simple
   * @return ataque del motor simple
   */

  @Override public int getAtaque(){

    return 0;

  }

  /**
   * Metodo que nos regresa la defensa del motor simple
   * @return la defensa del motor simple
   */

  @Override public int getDefensa(){

    return 0;

  }

  /**
   * Metodo que nos regresa el costo del motor simple
   * @return el costo del motor simple
   */

  @Override public int getCosto(){

    return 60000;

  }
  

}
