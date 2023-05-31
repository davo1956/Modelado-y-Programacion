/**
 * Interfaz que implementa los metodos de cada tipo de llanta
 */
public interface Llanta{

    /**
     * Metodo que nos crea un tipo de llanta
     */
    
    public void creaLlanta();

    /**
     * nos crea el tipo de llanta seleccionads
     */

    public void getNombre();

    /**
     * regres el valor de la velocidad dependioendo del tipo
     * @return la velocidad del auto
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
