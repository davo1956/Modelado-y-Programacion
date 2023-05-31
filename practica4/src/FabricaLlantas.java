/**
 * Clase concreta fabrica de llantas que dependiendo del tipo de llanta seleccionado nos 
 * crea un tipo de llanta
 */
public class FabricaLlantas extends FabricaAbstracta{


  /**
   * Metodo de la interfaz implementado en la clase concreta
   * @return dependiendo del tipo nos regresa la llanta
   */

  @Override public Object getComponente(String componente){
  
    return getLlanta(componente);

  }

  /**
  * Metodo que nos regresa el tipo de llanata  
  * @param tipoLlanta
  * @return un objeto de tipo llanta dependiendo de la llanta solicitada
  */


  public Llanta getLlanta(String tipoLlanta){

    if(tipoLlanta == null){
      return null;
    }else if(tipoLlanta.equalsIgnoreCase("simple")){
      return new LlantaSimple();
    }else if(tipoLlanta.equalsIgnoreCase("off")){
      return new LlantaOff();
    }else if(tipoLlanta.equalsIgnoreCase("deportiva")){
      return new LlantaDeportiva();
    }else if(tipoLlanta.equalsIgnoreCase("oruga")){
      return new LlantaOruga();
    }
    return null;
  }

}
