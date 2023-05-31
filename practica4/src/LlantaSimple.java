/**
 * Clase que nos regresa el tipo de llanta simple
 */

public class LlantaSimple implements Llanta{

  private String nombre = "";

  /**
   * metodo que crea una llanta
   */

  @Override public void creaLlanta(){
    nombre = "Llantas simples";

  }

  /**
   * metodo que nos regresa el tipo de llantas 
   */

  @Override public void getNombre(){
    System.out.println(nombre);

  }

  /**
   * metodo que nos regresa el valor de la velocidad del auto
   * @return velocidad de la llanta
   */

  @Override public int getVelocidad(){
    return 7;

  }

  /**
   * metodo que nos regresa el ataque del auto
   * @return el ataque de la llanta
   */

  @Override public int getAtaque(){
    return 0;

  }

  /**
   * Metodo que nos regresa la defensa de la llanta
   * @return defensa de la llanta
   */

  @Override public int getDefensa(){
    return 0;

  }

  /**
   * metodo que nos da el costo de esta llanta
   * @return costo de la llanta
   */

  @Override public int getCosto(){
    return 5000;

  }
}
