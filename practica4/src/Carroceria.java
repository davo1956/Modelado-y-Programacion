/**
 * Interfaz que implementa los metodos de cada tipo de carroceria
 */

public interface Carroceria{

    /**
     * Metodo que nos crea un tipo de carroceria
     */

    public void creaCarroceria();

    /**
     * nos crea el tipo de carroceria selecionada
     */

    public void getNombre();

    /**
     * regres el valor de la velocidad dependioendo del tipo de carroceria
     * @return la velocidad de la carroceria
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
