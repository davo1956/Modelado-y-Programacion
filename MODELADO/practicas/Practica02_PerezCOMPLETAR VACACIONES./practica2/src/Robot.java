//import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

/**
 * Clase de Robot que nos dara su estado inicial.
 */

public class Robot {

    /**
     * Definimos los estados del Robot
     */

    EstadoRobot robotCaminando;
    EstadoRobot robotReabasteciendo;
    EstadoRobot robotRecibiendoOrden;
    EstadoRobot robotSuspendido;
    EstadoRobot robotTrabajando;

    /**
     * Definimos su estado actual.
     */

    EstadoRobot estadoActual;

    String area1 = "Area de Descanso";
    String area2 = "Area de Materiales";
    String area3 = "Terreno";

    /**
     * Constructor de Robot.
     */

    public Robot(){
        robotCaminando = new RobotCaminando(this);
        robotReabasteciendo = new RobotReabasteciendo(this);
        robotRecibiendoOrden = new RobotRecibiendoOrden(this);
        robotSuspendido = new RobotSuspendido(this);
        robotTrabajando = new RobotTrabajando(this);

        estadoActual = robotSuspendido;
    }

    /**
     * Nos regresa el area1 
     * @return area 1, la de descanso
     */

    public String getArea1(){
        return area1;
    }

    /**
     * Definimos el area de descanso
     */

    public void setArea1(String descanso){
        area1 = descanso;
    }

    /**
     * Nos regresa el area 2
     * @return area 2, el area de materiales.
     */

    public String getArea2(){
        return area2;
    }

    /**
     * Definimos el area de materiales
     */

    public void setArea2(String materiales){
        area2 = materiales;
    }

    /**
     * Nos regresa el area 3
     * @return area 3, el terreno
     */

    public String getArea3(){
        return area3;
    }

    /**
     * Definimos el terreno
     */

    public void setArea3(String terreno){
        area3 = terreno;
    }

    /**
     * Declaracion de los distintos metodos de los 5 estados diferentes
     * del robot, para inicializarlo.
     */

    public void suspendido(){
        estadoActual.suspendido();
    }

    public void recibiendoOrden(){

        estadoActual.recibiendoOrden();
    }

    public void caminando(int i){
        estadoActual.caminando(i);
    }

    public void reabasteciendo(){
        estadoActual.reabasteciendo();
    }

    public void trabajando(int i){
        estadoActual.trabajando(i);
    }

    /**
     * Metodos gets que nos regresan el estado de nuestro robot
     * @return estados de nuesto robot, de la clase EstadoRobot
     */

    public EstadoRobot getEstadoRobotCaminando(){
        return robotCaminando;
    }

    public EstadoRobot getEstadoRobotReabasteciendo(){
        return robotReabasteciendo;
    }

    public EstadoRobot getEstadoRobotRecibiendoOrden(){
        return robotRecibiendoOrden;
    }

    public EstadoRobot getEstadoRobotSuspendido(){
        return robotSuspendido;
    }

    public EstadoRobot getEstadoRobotTrabajando(){
        return robotTrabajando;
    }

    /**
     * Metodo que nos asigna un nuevo estado a nuestro robot.
     * @param nuevoEstado, estado al que cambia o el nuevo estado del robot.
     */

    public void nuevoEstadoRobot(EstadoRobot nuevoEstado){
        estadoActual = nuevoEstado;
    }


}