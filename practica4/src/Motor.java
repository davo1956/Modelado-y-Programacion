/**
 * Interfaz que implementa los metodos de cada tipo de motor
 */

public interface Motor{

    /**
     * Metodo que nos crea un tipo de motor
     */

    public void creaMotor();

    /**
     * nos crea el tipo de motor selecionado
     */

    public void getNombre();

    /**
     * regres el valor de la velocidad dependioendo del tipo de motor
     * @return la velocidad del motor
     */

    public int getVelocidad();

    /**
     * regresa el daño que hace el ataque
     * @return el ataque daño
     */

    public int getAtaque();

    /**
     * regresa el valo de la defensa que soporta el ataque
     * @return valor de la defensa 
     */

    public int getDefensa();

    /**
     * regresa el costo del tipo seleccionado
     * @return el costo del tipo seleccionado
     */

    public int getCosto();

}
