/**
 * Interfaz que implementa los metodos de cada tipo de blindaje
 */

public interface Blindaje{

    /**
     * Metodo que nos crea un tipo de blindaje
     */

    public void creaBlindaje();

    /**
     * nos crea el tipo de blindaje selecionado
     */

    public void getNombre();

    /**
     * regres el valor del tipo de blindaje dependioendo del tipo de blindaje
     * @return la velocidad del blindaje
     */

    public int getVelocidad();

    /**
     * regresa el daño que hace el tipo de blindaje
     * @return el ataque del blindaje
     */

    public int getAtaque();

    /**
     * regresa el valo de la defensa que soporta el blindaje
     * @return valor del blindaje
     */

    public int getDefensa();

    /**
     * regresa el costo del tipo de blindaje seleccionado
     * @return el costo del tipo de blindaje seleccionado
     */

    public int getCosto();

    

}
