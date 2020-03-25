/**
 * Clase que nos define el estado de cuando nuestro robot solo esta reabasteciendo 
 */

public class RobotReabasteciendo implements EstadoRobot {

    Robot robot;

    /**
     * Metodo constructor de nuestro Robot.
     * @param newRobot
     */

    public RobotReabasteciendo(Robot newRobot) {
        robot = newRobot;
    }

    /**
     * Metodo suspendido del robot. Metodo que miesntras el robot reabastece
     * suspenderlo
     */

    public void suspendido() {
        System.out.println("Robot reabasteciendo no puede ser suspendido");
    }

    /**
     * Metodo recibiendo Orden metodo que no dañara al robot ya que no recibe orden
     * miesntras reabastece
     */

    public void recibiendoOrden() {
        System.out.println("Robot no puede recibir orden miesntras se reabastece");
    }

    /**
     * Metodo reabasteciendo un robot no puede reabastecer mienstras reabastece
     */

    public void reabasteciendo() {
        robot.caminando(2);
        System.out.println("Robot en area de materiales reabasteciendo...");
        System.out.println("Robot reabastecido.");
    }

    /**
     * Metodo trabajandp El robot no puede trabajar miesntras reabastece
     */

    public void trabajando(int i) {
        System.out.println("El Robot no puede Trabajar ni constrir miesntras resbastece.");

    }

    /**
     * Metodo que no permite caminar miesntras se abastece
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