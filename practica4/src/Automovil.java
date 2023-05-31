/**
 * Clase que crea un automovil con todas sus especificaciones
 */

public class Automovil{

  /**
   * Creeamos instacias de las clases de sus determinados componentes
   */

  public Llanta llanta;

  public Motor motor;

  public Carroceria carroceria;

  public Blindaje blindaje;

  public Arma arma;

  /**
   * Constructor de la clase
   * @param llanta
   * @param motor
   * @param carroceria
   * @param blindaje
   * @param arma
   */

  public Automovil(Llanta llanta, Motor motor, Carroceria carroceria, Blindaje blindaje, Arma arma){
    this.llanta = llanta;
    this.motor = motor;
    this.carroceria = carroceria;
    this.blindaje = blindaje;
    this.arma = arma;
  }

  /**
   * Metood que nos muestra las especificaciones
   */

  public void muestraAutomovil(){
    System.out.println("El automovil construido es el siguiente:");
    llanta.getNombre();
    motor.getNombre();
    carroceria.getNombre();
    blindaje.getNombre();
    arma.getNombre();
  }

  
  public void muestraDefensa(){
    int defensa;
    defensa = llanta.getDefensa() + motor.getDefensa() + carroceria.getDefensa() + blindaje.getDefensa() + arma.getDefensa();
    String def = "" + defensa;
    System.out.println("La Defensa es: " + def);
  }

  public void muestraAtaque(){
    int ataque;
    ataque = llanta.getAtaque() + motor.getAtaque() + carroceria.getAtaque() + blindaje.getAtaque() + arma.getAtaque();
    String atac = "" + ataque;
    System.out.println("El ataque es: " + atac);
  }

  public void muestraVelocidad(){
    int velocidad;
    velocidad = llanta.getVelocidad() + motor.getVelocidad() + carroceria.getVelocidad() + blindaje.getVelocidad() + arma.getVelocidad();
    String veloz = "" + velocidad;
    System.out.println("La velocidad del auto es: " + veloz);
  }

  public void muestraCostoTotal(){
    int costoTotal;
    costoTotal = llanta.getCosto() + motor.getCosto() + carroceria.getCosto() + blindaje.getCosto() + arma.getCosto();
    String costo = "" + costoTotal;
    System.out.println("El costo total del auto es: $" + costo + ".00"); 
  }



}
