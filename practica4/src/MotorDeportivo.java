/**
 * Clase que implementa el tipo de motor deportivo
 */

public class MotorDeportivo implements Motor{


  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de motor deportivo
   */

  @Override public void creaMotor(){
    nombre = "Motor deportivo";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de motor deportivo
   */

  @Override public void getNombre(){
    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad del motor deportivo
   * @return velocidad del motor deportivo
   */

  @Override public int getVelocidad(){
    return 50;

  }

  /**
   * Metodo que nos regresa el ataque del motor
   * @return ataque del motor
   */

  @Override public int getAtaque(){
    return 0;

  }

  /**
   * Metodo que nos regresa la defensa del motor deportivo
   * @return la defensa del motor deportivo
   */

  @Override public int getDefensa(){
    return 0;

  }

  /**
   * Metodo que nos regresa el costo del motor deportivo
   * @return el costo del motor deportivo
   */

  @Override public int getCosto(){
    return 80000;

  }

  
}
