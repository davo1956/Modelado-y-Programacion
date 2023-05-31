/**
 * Clase que crea un baguette con un tipo de pan integral
 * de 2 panes a escojer
 */

public class BaguetteIntegral extends Baguette {

    /**
     * Metodo que regresa el precio de un baguette con pan integral.
     * @return double el precio del pan 
     */

    @Override
    public double getPrecio(){
        return 20; //precio de baguette con pan integral
    }

    /**
     * Metodo que regresa la descripcion del baguette y tipo de pan.
     * @return String la descripcion del pan.
     */

    @Override
    public String getDescripcion(){
        return "Baguette con pan integral: ";
    }
    
}