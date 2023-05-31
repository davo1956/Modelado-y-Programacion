/**
 * Clase que implementa el tipo de carroceria deportiva
 */

public class CarroceriaDeportiva implements Carroceria{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de carroceria deportiva
   */

  @Override public void creaCarroceria(){

    nombre = "Carroceria deportiva";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de carroceria deportivo
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad de la carroceria deportiva
   * @return velocidad de la carroceria deportiva
   */

  @Override public int getVelocidad(){

    return 0;

  }

  /**
   * Metodo que nos regresa el ataque de la carroceria deportiva
   * @return ataque de la carroceria deportiva
   */

  @Override public int getAtaque(){

    return 0;

  }

  /**
   * Metodo que nos regresa la defensa de la carroceria deportivo
   * @return la defensa de la carroceria deportivo
   */

  @Override public int getDefensa(){

    return 0;

  }

  /**
   * Metodo que nos regresa el costo de la carroceria deportiva
   * @return el costo de la carroceria deportiva
   */

  @Override public int getCosto(){

    return 40000;

  }

  
}
