/**
 * Clase que implementa el tipo de lanzallama
 */

public class Lanzallamas implements Arma{

  private String nombre = "";

  /**
   * Metodo que nus crea un tipo de lanzallamas
   */

  @Override public void creaArma(){

    nombre = "Lanzallamas";

  }

  /**
   * Metodo que nos regresa el nombre del tipo de lanzallamas
   */

  @Override public void getNombre(){

    System.out.println(nombre);

  }

  /**
   *Metodo que nos regresa la velocidad del lanzallams
   * @return velocidad del lanzallamas
   */

  @Override public int getVelocidad(){

    return 0;

  }

  /**
   * Metodo que nos regresa el ataque del lanzallmas
   * @return ataque del lanzallamas
   */

  @Override public int getAtaque(){

    return 35;

  }

  /**
   * Metodo que nos regresa la defensa del lanzallamas
   * @return la defensa del lanzallamas
   */

  @Override public int getDefensa(){

    return 0;

  }

  /**
   * Metodo que nos regresa el costo del lanzallamas
   * @return el costo del lanzallamas
   */

  @Override public int getCosto(){
    return 10000;
  }

}
