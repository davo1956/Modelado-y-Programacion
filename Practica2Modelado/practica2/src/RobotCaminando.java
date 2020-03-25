/**
 * Clase que nos define el estado de cuando nuestro robot solo esta camianndo. 
 */

public class RobotCaminando implements EstadoRobot {

    Robot robot;

    /**
     * Metodo constructor de nuestro Robot.
     * @param newRobot
     */

    public RobotCaminando(Robot newRobot) {
        robot = newRobot;
    }

    /**
     * Metodo suspendido del robot. Metodo que miesntras el robot camina permite
     * suspenderlo
     */

    public void suspendido() {
        System.out.println("Espere un momento");
        robot.nuevoEstadoRobot(robot.getEstadoRobotSuspendido());
        System.out.println("Robot suspendido");
    }

    /**
     * Metodo recibiendo Orden metodo que no dañara al robot ya que no recibe orden
     * miesntras camina
     */

    public void recibiendoOrden() {
        System.out.println("Robot no puede recibir orden miesntras camina");
    }

    /**
     * Metodo reabasteciendo un robot no puede reabastecer mienstras camina
     */

    public void reabasteciendo() {
        System.out.println("El robot no puede reabastecer mientras esta camianando");
    }

    /**
     * Metodo trabajandp El robot no puede trabajar miesntras camina
     */

    public void trabajando(int i) {
        System.out.println("El Robot no puede Trabajar ni constrir miesntras camina.");

    }

    /**
     * Metodo que nos modela el recorrido a las localidades a las que se transporta
     * nuestro robot
     * 
     * @param i es la opcion a la que se transporta el robot 1 si va al area de
     *          descanso 2 si va al area de materiales 3 si va al terreno
     */

    public void caminando(int i) {
        switch (i) {
            case 1:
                System.out.println("El robot camina hacia el area de descanso");
                robot.nuevoEstadoRobot(robot.getEstadoRobotSuspendido());
                break;
            case 2: 
                System.out.println("El robot se dirige al area de Materiales");
                robot.nuevoEstadoRobot(robot.getEstadoRobotReabasteciendo());
                break;
            case 3: 
                System.out.println("El robot se dirige al Terreno");
                robot.nuevoEstadoRobot(robot.getEstadoRobotTrabajando());
                break;
            default:
                System.out.println("Instruccion erronea, no puedo hacer eso");
                break;
        }
        

    }


}