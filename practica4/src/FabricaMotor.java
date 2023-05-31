/**
 * Clase concreta fabrica de motor que dependiendo del tipo de motor seleccionado nos 
 * crea un tipo de motor
 */

public class FabricaMotor extends FabricaAbstracta{


  /**
   * Metodo de la interfaz implementado en la clase concreta
   * @return dependiendo del tipo nos regresa el motor
   */
  
   @Override public Object getComponente(String componente){

    return getMotor(componente);

  }

  /**
  * Metodo que nos regresa el tipo de motor
  * @param tipoMotor
  * @return un objeto de tipo Motor dependiendo del motor  solicitada
  */

  public Motor getMotor(String tipoMotor){
    if(tipoMotor == null){
      return null;
    }else if(tipoMotor.equalsIgnoreCase("deportivo")){
      return new MotorDeportivo();
    }else if(tipoMotor.equalsIgnoreCase("simple")){
      return new MotorSimple();
    }else if(tipoMotor.equalsIgnoreCase("diesel")){
      return new MotorDiesel();
    }
    return null;
  }

}
