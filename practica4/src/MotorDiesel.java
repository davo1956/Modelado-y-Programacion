/**
 * Clase que implementa el tipo de motor disel
 */

public class MotorDiesel implements Motor{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de motor disel
   */

  @Override public void creaMotor(){

    nombre = "Motor diesel";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de motor disel
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad del motor disel
   * @return velocidad del motor disel
   */

  @Override public int getVelocidad(){

    return 20;

  }

  /**
   * Metodo que nos regresa el ataque del motor disel
   * @return ataque del motor disel
   */

  @Override public int getAtaque(){

    return 0;

  }

  /**
   * Metodo que nos regresa la defensa del motor disel
   * @return la defensa del motor disel
   */

  @Override public int getDefensa(){

    return 0;

  }

  /**
   * Metodo que nos regresa el costo del motor disel
   * @return el costo del motor disel
   */

  @Override public int getCosto(){

    return 40000;

  }

  
}
