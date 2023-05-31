/**
 * Clase que crea un baguette con un tipo de pan clasico
 * de 2 panes a escojer.
 */
public class BaguetteClasico extends Baguette {

    /**
     * Metodo que regresa el precio de un baguette con pan clasico
     * @return double el precio del baguette.
     */

    @Override
    public double getPrecio(){
        return 15; //precio del baguette.
    }

    /**
     * Metodo que regresa la descripcion del baguette y su tipo de pan clasico
     * @return String la descripcion de que tipo de baguette se trata.
     */

    @Override
    public String getDescripcion(){
        return "Baguette con pan clasico: ";
    }
}