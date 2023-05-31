/**
 * Clase del condimento Cebolla que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */

public class Cebolla extends CondimentoBaguette {

    /**
     * Constructor de la clase Cebolla
     * @param baguette el baguette que podemos agregarle cebola.
     */

    public Cebolla(Baguette baguette){
        this.baguette = baguette;
    }

     /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio de la cebolla.
     * @return double el precio del baguette con cebolla. 
     */

    @Override
    public double getPrecio(){
        return baguette.getPrecio() + 5; //precio cebolla
    }

    /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente cebolla.
     */

    @Override
    public String getDescripcion(){
        return baguette.getDescripcion() + "con cebolla, ";
    }

}