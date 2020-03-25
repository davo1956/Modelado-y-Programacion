import java.util.*;
/**
 * Clase que nos define el estado cuando el robot recibe una orden.
 */

public class RobotRecibiendoOrden implements EstadoRobot {
    
    Robot robot;
    
    //Creamos un scanner para recibir las ordenes.
    
    Scanner scanner = new Scanner(System.in);
    
    Scanner scanner2 = new Scanner(System.in);
    
    boolean salir = false;
    boolean salir2 = false;
    int opcion; //guardamos la opcion selecionada.
    int opcion2; //opcion para el menu de trabajando
    int tipoCasa;
    

    /**
     * Constructor de la clase Robot Recibiendo Orden.
     * @param newRobot
     */

    public RobotRecibiendoOrden(Robot newRobot){
        robot = newRobot;
    }

    /**
     * Metodo suspendido, este metodo no se ejecuta ya que mienstras recibe una orde
     * el robot no puede ser suspendido.
     */

    public void suspendido(){
        System.out.println("El robot no puede suspenderse mienstras recibe ordenes");

    }

    /**
     * Metodo recibiendo Ordenes, el robot recibe las ordenes y se dirige al area de abastecimiento
     */

    public void recibiendoOrden(){
        while(!salir){
            System.out.println("1. Mandar al robot a trabajar");
            System.out.println("2. Salir");

            try {
                System.out.println("Escriba alguna opcion");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Recibiendo Instruccion...");
                        System.out.println("Robot caminando a area de materiales");
                        robot.nuevoEstadoRobot(robot.getEstadoRobotCaminando());
                        System.out.println("Robot reabasteciendo materiales");
                        robot.nuevoEstadoRobot(robot.getEstadoRobotReabasteciendo());
                        System.out.println("Robot reabasteciendo y a punto de trabajar");
                        robot.trabajando(tipoCasa);
                        break;
                    case 2:
                        System.out.print("Recibiendo instruccion");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo vaores 1 y 2");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo acepta valor numerico 1 y 2");
                scanner.next();
            }
        }
    }

    /**
     * Metodo de Reabastecer, el robot no reabastece hasta tener una orden.
     */

    public void reabasteciendo(){
        System.out.println("No puedo reabastecer mientras recibo una oden");
    }

    /**
     * Metodo trabajando, el robot no puede trabjar sin una orden.
     * aqui se dan las opciones al robot cuando se selecciono mandar a 
     * trabajar al robot en el metodo recibiendoOrden
     */

    public void trabajando(int i){
        while(!salir2){
            System.out.println("1. Esqueleto de concreto");
            System.out.println("2. Esqueleto reforzado");
            System.out.println("3. Ailamiento de concreto");
            System.out.println("4. Ailamiento de vidrio");
            System.out.println("5. Ailamiento de madera");
            System.out.println("6. Ailamiento Reforzado");
            System.out.println("7. Salir");

            try {
                System.out.println("Escriba una opcion");
                opcion2 = scanner2.nextInt();

                switch(opcion2){
                    case 1:
                        System.out.println("Opcion1");
                        robot.nuevoEstadoRobot(robot.getEstadoRobotTrabajando());
                        break;
                    case 2: 
                        System.out.println("Opcion2");
                        robot.nuevoEstadoRobot(robot.getEstadoRobotTrabajando());
                        break;
                    case 3:
                        System.out.println("Opcion3");
                        robot.nuevoEstadoRobot(robot.getEstadoRobotTrabajando());
                        break;
                    case 4:
                        System.out.println("Opcion4");
                        robot.nuevoEstadoRobot(robot.getEstadoRobotTrabajando());
                        break;
                    case 5:
                        System.out.println("Opcion5");
                        robot.nuevoEstadoRobot(robot.getEstadoRobotTrabajando());
                        break;
                    case 6:
                        System.out.println("Opcion 6");
                        robot.nuevoEstadoRobot(robot.getEstadoRobotTrabajando());
                        break;
                    case 7:
                        System.out.println("salir");
                        salir2 = true;
                        break;
                    default: 
                        System.out.println("Solo numeros");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Valores Númericos");
                scanner2.next();
            }
        }    
    }

    /**
     * Metodo caminado, el robot no puede caminar miesntras recibe ordenes
     */

    public void caminando(int i){
        System.out.println("Robot no puede caminar en este momento, hasta recibir una orden.");
    
    }





    

}