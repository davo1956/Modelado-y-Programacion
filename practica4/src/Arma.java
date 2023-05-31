/**
 * Interfaz que implementa los metodos de cada tipo de arma
 */
public interface Arma{

    /**
     * Metodo que nos crea un tipo de arma
     */

    public void creaArma();

    /**
     * nos crea el tipo de arma selecionado
     */

    public void getNombre();

    /**
     * regres el valor de la velocidad dependioendo del tipo de arma
     * @return la velocidad del arma
     */

    public int getVelocidad();

    /**
     * regresa el daño que hace el ataque
     * @return el ataque daño
     */

    public int getAtaque();

    /**
     * regresa el valo de la defensa que soporta el ataque
     * @return valor de la defensa del arma
     */

    public int getDefensa();

    /**
     * regresa el costo del tipo seleccionado
     * @return el costo del tipo seleccionado
     */

    public int getCosto();
    

}
