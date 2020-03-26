/**
 * Interfaz General es la interface que contiene los metodos 
 * e los cuales implementara (metodos que todas las plataformas
 * usaran) de la clase  Abstracta Plataforma.
 */
public interface InterfazGeneral{
    /**
     * Metodo que le da la bienvenida al cliente a la Plataforma. 
     * @param c Cliente al que le da la bienvenida
    */
    public void bienvenida(Cliente c);
    /*
    Metodo que le Avisa cualquier cosa al Cliente de la plataforma.
    */
    public void notificar();
  
}
