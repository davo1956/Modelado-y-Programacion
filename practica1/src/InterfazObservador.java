/**
 * Interfaz Observador es la interface que tiene el metodo que nos
 * permitira utilizar el patron de diseño Observer
 * 
 * implementa a observador a quien le podra notificar lo que suceda con la
 * plataforma seleccionada
 * 
 * Con un solo metodo no desarrollado que es el responsable de observar 
 * y notificar
 */
public interface InterfazObservador{

    
    public void update(Plataforma p);
}