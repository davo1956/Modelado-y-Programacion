/**
 * Clase del condimento Catsup que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */

public class Catsup extends CondimentoBaguette {

    /**
     * Constructor de la clase Catsup
     * @param baguette el baguette que podemos agregarle catsup.
     */

    public Catsup(Baguette baguette){
        this.baguette = baguette;
    }

    /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio del catsup.
     * @return double el precio del baguette con catsup 
     */

    @Override 
    public double getPrecio(){
        return baguette.getPrecio() + 8; //precio Catsup
    }

    /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente catsup.
     */

    @Override
    public String getDescripcion(){
        return baguette.getDescripcion() + "con catsup, ";
    }
}
