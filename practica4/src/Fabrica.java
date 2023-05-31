/**
 * Clase Fabrica que dependiendo del componente que nos este pidiendo nos lo regrese
 */
public class Fabrica{

  /**
   * Metodo que nos regresa una instacia de fabrica abstracta y recibe el componente a crear
   */

  public static FabricaAbstracta getFabrica(String componente){

    if(componente.equalsIgnoreCase("llanta")){
      return new FabricaLlantas();
    }else if(componente.equalsIgnoreCase("motor")){
      return new FabricaMotor();
    }else if(componente.equalsIgnoreCase("carroceria")){
      return new FabricaCarroceria();
    }else if(componente.equalsIgnoreCase("blindaje")){
      return new FabricaBlindaje();
    }else if(componente.equalsIgnoreCase("arma")){
      return new FabricaArmas();
    }
    return null;


  }

}
