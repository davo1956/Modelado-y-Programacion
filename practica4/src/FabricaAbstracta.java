/**
 * Clase abstracta que nos implementa un metodo obstracto para devolver el tipo de componente.
 */
public abstract class FabricaAbstracta{

    /**
     * Metodo abstrtacto que nos regresa el componente a crear
     * @param tipo de componente a crear
     * @return el objeto que creamos
     */

public abstract Object getComponente(String tipo);

}
