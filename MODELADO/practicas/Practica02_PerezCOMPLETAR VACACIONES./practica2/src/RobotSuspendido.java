/**
 * Clase que nos define el estado cuando nuestro robot esta suspendido
 */

public class RobotSuspendido implements EstadoRobot {

    Robot robot;

    /**
     * Cnstructor de nuestro robot
     * @param newRobot
     */

    public RobotSuspendido(final Robot newRobot){
        robot = newRobot;
    }

    /**
     * Metodo suspendido estado inicial del Robot
     */

    public void suspendido(){
        System.out.println("Robot suspendido");
        System.out.println("Robot en area de descanso");
        
    }

    /**
     * Metodo que recibe orden.
     * este metodo modifica el estado inicial de nuestro robot
     */

    public void recibiendoOrden(){
        System.out.println("Bienvenido, Robot suspendido");
        robot.nuevoEstadoRobot(robot.getEstadoRobotRecibiendoOrden());
        System.out.println("Robot a espera de orden ");

    }

    /**
     * Metodo reabasteciendo.
     * este metodo no se ejecuta porque el robot esta suspemndido
     */

    public void reabasteciendo(){
        System.out.println("robot suspendido, intente con otra llamada");
    }

    /**
     * Metodo trabajando, el robot no puede trabajar miesntras esta suspendido.
     */

    public void trabajando(int i){
        System.out.println("Robot en estado suspendido, no es posible ejecutar esta orden");
    }

    /**
     * Metodo caminando, el robot no puede caminar niesntras esta suspendido.
     */

    public void caminando(int i){
        System.out.println("El robot no puede caminar ya que se encuentra suspendido, digite otra opcion");

    }
}