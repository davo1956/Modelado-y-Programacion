/**
 * Clase concreta fabrica de blindaje que dependiendo del tipo de blindaje seleccionado nos 
 * crea un tipo de blindaje
 */

public class FabricaBlindaje extends FabricaAbstracta{

  /**
   * Metodo de la interfaz implementado en la clase concreta
   * @return dependiendo del tipo nos regresa el blindaje
   */


  @Override public Object getComponente(String componente){
    return getBlindaje(componente);
  }

  /**
  * Metodo que nos regresa el tipo de blindaje
  * @param tipoBlindaje
  * @return un objeto de tipo blindaje dependiendo del blindaje  solicitada
  */

  public Blindaje getBlindaje(String tipoBlindaje){

    
    if(tipoBlindaje == null){
      return null;
    }else if(tipoBlindaje.equalsIgnoreCase("simple")){
      return new BlindajeSimple();
    }else if(tipoBlindaje.equalsIgnoreCase("reforzado")){
      return new BlindajeReforzado();
    }else if(tipoBlindaje.equalsIgnoreCase("tanque")){
      return new BlindajeTanque();
    }
    return null;


  }



}
