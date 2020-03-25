/**
 * Nuestra interfaz que define los  estados de nuestro Robot. 
 */

public interface EstadoRobot {

    /**
     * Metodos que seran implementados en las subclases
     * estos seran los estados de nuestro robot.
     */

    public void suspendido();

    public void recibiendoOrden();

    public void caminando(int i);

    public void reabasteciendo();

    public void trabajando(int i);

}