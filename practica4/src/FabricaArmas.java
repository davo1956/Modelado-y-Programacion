/**
 * Clase concreta fabrica de armas que dependiendo del tipo de arma seleccionado nos 
 * crea un tipo de arma
 */

public class FabricaArmas extends FabricaAbstracta{

  /**
   * Metodo de la interfaz implementado en la clase concreta
   * @return dependiendo del tipo nos regresa las armas
   */

  @Override public Object getComponente(String componente){
    return getArmas(componente);
  }

  /**
  * Metodo que nos regresa el tipo de arma
  * @param tipoArma
  * @return un objeto de tipo armas dependiendo del arma  solicitada
  */

  public Arma getArmas(String tipoArma){
    if(tipoArma == null){
      return null;
    }else if(tipoArma.equalsIgnoreCase("Arpón")){
      return new Arpon();
    }else if(tipoArma.equalsIgnoreCase("Lanzallamas")){
      return new Lanzallamas();
    }else if(tipoArma.equalsIgnoreCase("Lanza")){
      return new Lanza();
    }else if(tipoArma.equalsIgnoreCase("Sierra")){
      return new Sierra();
    }else if(tipoArma.equalsIgnoreCase("Metralleta")){
      return new Metralleta();
    }
    return null;
  }

}
