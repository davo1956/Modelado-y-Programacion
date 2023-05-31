/**
 * Clase concreta fabrica de motor que dependiendo del tipo de carroceria seleccionado nos 
 * crea un tipo de carroceria
 */

public class FabricaCarroceria extends FabricaAbstracta{

  /**
   * Metodo de la interfaz implementado en la clase concreta
   * @return dependiendo del tipo nos regresa la carroceria
   */

  @Override 
  public Object getComponente(String componente){

    return getCarroceria(componente);

  }

  /**
  * Metodo que nos regresa el tipo de carroceria
  * @param tipoCarroceria
  * @return un objeto de tipo Carroceria dependiendo de la carroceria  solicitada
  */

  public Carroceria getCarroceria(String tipoCarroceria){

    if(tipoCarroceria == null){
      return null;
    }else if(tipoCarroceria.equalsIgnoreCase("casual")){
      return new CarroceriaCasual();
    }else if(tipoCarroceria.equalsIgnoreCase("deportiva")){
      return new CarroceriaDeportiva();
    }else if(tipoCarroceria.equalsIgnoreCase("camion")){
      return new CarroceriaCamion();
    }
    return null;

  }
  

}
