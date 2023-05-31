/**
 * Clase del condimento Pollo que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */

public class Jitomate extends CondimentoBaguette {

    /**
     * Constructor de la clase Jitomate 
     * @param baguette el baguette que podemos agregarle jitomate.
     */

    public Jitomate(Baguette baguette){
        this.baguette = baguette;
    }

    /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio del jitomate.
     * @return double el precio del baguette con jitomate. 
     */

    @Override
    public double getPrecio(){
        return baguette.getPrecio() + 8; //precio del jitomate
    }

    /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente jitomate.
     */

    @Override
    public String getDescripcion(){
        return baguette.getDescripcion() + "con jitomate, ";
    }

}