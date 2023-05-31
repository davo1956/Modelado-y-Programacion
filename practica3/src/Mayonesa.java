/**
 * Clase del condimento Mayonesa que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */
public class Mayonesa extends CondimentoBaguette {

    /**
     * Constructor de la clase Mayonesa
     * @param baguette el baguette que podemos agregarle mayonesa.
     */

    public Mayonesa(Baguette baguette){
        this.baguette = baguette;
    }

    /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio de la mayonesa.
     * @return double el precio del baguette con mayonesa. 
     */

    @Override 
    public double getPrecio(){
        return baguette.getPrecio() + 7; //precio mayinesa.
    }

    /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente mayonesa.
     */

    @Override 
    public String getDescripcion(){
        return baguette.getDescripcion() + "con mayonesa, ";
    }



}