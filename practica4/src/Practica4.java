import java.util.Scanner;
import java.util.InputMismatchException;


public class Practica4 {

    public static Scanner sc = new Scanner(System.in);
    //public static int saldoInicial = 5000000;

    //fabricar todo
    public static Fabrica fabrica = new Fabrica();

    //Fabrica de cada parte.
    public static FabricaAbstracta fabricallantas = fabrica.getFabrica("LLANTA");
    public static FabricaAbstracta fabricaMotor = fabrica.getFabrica("MOTOR");
    public static FabricaAbstracta fabricaCarroceria = fabrica.getFabrica("CARROCERIA");
    public static FabricaAbstracta fabricaBlindaje = fabrica.getFabrica("BLINDAJE");
    public static FabricaAbstracta fabricaArmas = fabrica.getFabrica("ARMA");




    public static void main(String[] args) {

        int sw = 0;

        do {
            System.out.println("\nBienvenido a la creacion de su nuevo auto\n");
            System.out.printf("Selecciona una opcion: \n" +
                              "1. Recibir un auto aleatoriamente\n" +
                              "2. Crear su propio auto\n" + 
                              "0. Salir\n");

            try {
                sw = sc.nextInt();
                switch(sw) {
                    case 0:
                        sc.close();
                        System.exit(0);
                    case 1:
                        opcionAleatorio();
                        break;
                    case 2:
                        opcionCrear();
                        break;
                    default :
                        System.out.println("Opcion incorrecta, intente una valida.\n");

                }
            } catch (InputMismatchException ime){
                System.out.println("\nOpcion erronea. ");
                System.exit(1);
            }
        } while(sw != 0);

    }

    
    
    public static void opcionAleatorio(){
        int n = 0;
        do{
            System.out.printf("\nSeleccione un tipo de auto de los disponibles: \n" +
                            "1. Auto Clasico\n" +
                            "2. Auto mediano\n" +
                            "3. Auto lujoso\n" +
                            "0. Salir\n");
                            try {
                n = sc.nextInt();
                System.out.println();
                switch(n){
                    case 0:
                        sc.close();
                        System.exit(0);
                    case 1:
                        Llanta llantasClasico = (Llanta)fabricallantas.getComponente("simple");
                        llantasClasico.creaLlanta();
                        Carroceria carroceriaClasico = (Carroceria)fabricaCarroceria.getComponente("casual");
                        carroceriaClasico.creaCarroceria();
                        Motor motorClasico = (Motor)fabricaMotor.getComponente("simple");
                        motorClasico.creaMotor();
                        Blindaje blindajeClasico = (Blindaje)fabricaBlindaje.getComponente("simple");
                        blindajeClasico.creaBlindaje();
                        Arma armaClasico = (Arma)fabricaArmas.getComponente("Sierra");
                        armaClasico.creaArma();
                        Automovil autoClasico = new Automovil(llantasClasico, motorClasico, carroceriaClasico, blindajeClasico, armaClasico);
                        autoClasico.muestraAutomovil();
                        autoClasico.muestraDefensa();
                        autoClasico.muestraAtaque();
                        autoClasico.muestraVelocidad();
                        autoClasico.muestraCostoTotal();
                        System.out.println("Favor de depositar el dinero a la cuenta de la fabrica...");
                        break;
                    case 2:
                        Llanta llantasMediano = (Llanta)fabricallantas.getComponente("off");
                        llantasMediano.creaLlanta();
                        Carroceria carroceriaMediano = (Carroceria)fabricaCarroceria.getComponente("deportiva");
                        carroceriaMediano.creaCarroceria();
                        Motor motorMediano = (Motor)fabricaMotor.getComponente("deportivo");
                        motorMediano.creaMotor();
                        Blindaje blindajeMediano = (Blindaje)fabricaBlindaje.getComponente("reforzado");
                        blindajeMediano.creaBlindaje();
                        Arma armaMediano = (Arma)fabricaArmas.getComponente("Lanzallamas");
                        armaMediano.creaArma();
                        Automovil autoMediano = new Automovil(llantasMediano, motorMediano, carroceriaMediano, blindajeMediano, armaMediano);
                        autoMediano.muestraAutomovil();
                        autoMediano.muestraDefensa();
                        autoMediano.muestraAtaque();
                        autoMediano.muestraVelocidad();
                        autoMediano.muestraCostoTotal();
                        System.out.println("Favor de depositar el dinero a la cuenta de la fabrica...");
                        break;
                    case 3:
                        Llanta llantasLujoso = (Llanta)fabricallantas.getComponente("oruga");
                        llantasLujoso.creaLlanta();
                        Carroceria carroceriaLujoso = (Carroceria)fabricaCarroceria.getComponente("camion");
                        carroceriaLujoso.creaCarroceria();
                        Motor motorLujoso = (Motor)fabricaMotor.getComponente("diesel");
                        motorLujoso.creaMotor();
                        Blindaje blindajeLujoso = (Blindaje)fabricaBlindaje.getComponente("tanque");
                        blindajeLujoso.creaBlindaje();
                        Arma armaLujoso = (Arma)fabricaArmas.getComponente("Metralleta");
                        armaLujoso.creaArma();
                        Automovil autoLujoso = new Automovil(llantasLujoso, motorLujoso, carroceriaLujoso, blindajeLujoso, armaLujoso);
                        autoLujoso.muestraAutomovil();
                        autoLujoso.muestraDefensa();
                        autoLujoso.muestraAtaque();
                        autoLujoso.muestraVelocidad();
                        autoLujoso.muestraCostoTotal();
                        System.out.println("Favor de depositar el dinero a la cuenta de la fabrica...");
                        break;
                    default :
                        System.out.println("\nOpcion erronea, ingrese otra opcion");
                }
            } catch (InputMismatchException ime) {
                System.err.println("\nOpcion erronea");
                System.exit(1);
            }
        } while (n != 0);

    }



    public static Llanta llantaElegida;

    public static Carroceria carroceriaElegida;

    public static Motor motorElegido;

    public static Blindaje blindajeElegido;

    public static Arma armaElegida;


    public static void opcionCrear(){
        int cont = 0;

        do {
            System.out.printf("\nSeleccione sus componentes: \n" +
                              "1. Llantas.\n" +
                              "2. Carroceria.\n" +
                              "3. Motor.\n" +
                              "4. Blindaje.\n" +
                              "5. Arma.\n" +
                              "6. Imprime auto.\n" +
                              "0. Salir\n");
            try{
                cont = sc.nextInt();
                System.out.println();
                switch(cont){
                    case 0 :
                        sc.close();
                        System.exit(0);
                    case 1 :
                        menuCreaLlantas();
                        break;
                    case 2 :
                        menuCreaCarroceria();
                        break;
                    case 3 :
                        menuCreaMotor();
                        break;
                    case 4 :
                        menuCreaBlindaje();
                        break;
                    case 5 :
                        menuCreaArma();
                        break;
                    case 6 :
                        imprimeAutomovilCompleto();
                        break;
                    default :
                        System.out.println("\nOpcion erronea, ingrese la correcta");
                }
            } catch (InputMismatchException ime) {
                System.err.printf("\nOpcion erronea");
                System.exit(1);
            }
        } while(cont != 0);

    }



    public static void menuCreaLlantas(){
        int llanta = 0;

        do {
            System.out.printf("Seleccione un tipo de llanta: \n" +
                              "1. simple\n" +
                              "2. off\n" +
                              "3. deportiva\n" +
                              "4. oruga\n" +
                              "0. salir\n");
            try {
                llanta = sc.nextInt();
                switch(llanta){
                    case 0:
                        sc.close();
                        System.exit(0);
                    case 1:
                        llantaElegida = (Llanta)fabricallantas.getComponente("simple");
                        llantaElegida.creaLlanta();
                        opcionCrear();
                        break;
                    case 2:
                        llantaElegida = (Llanta)fabricallantas.getComponente("off");
                        llantaElegida.creaLlanta();
                        opcionCrear();
                        break;
                    case 3:
                        llantaElegida = (Llanta)fabricallantas.getComponente("deportiva");
                        llantaElegida.creaLlanta();
                        opcionCrear();
                        break;
                    case 4:
                        llantaElegida = (Llanta)fabricallantas.getComponente("oruga");
                        llantaElegida.creaLlanta();
                        opcionCrear();
                        break;
                    default :
                        System.out.println("\nOpcion Incorrecta digite la opción correcta");
                }
            } catch (InputMismatchException ime){
                System.err.println("\nOpcion incorrecta. ");
                System.exit(1);
                
            }
        } while (llanta != 0);

    }




    public static void menuCreaCarroceria(){
        int carroceria = 0;

        do {
            System.out.printf("Seleccione un tipo de carroceria: \n" +
                              "1. casual\n" +
                              "2. deportiva\n" +
                              "3. camion\n" +
                              "0. salir\n");
            try {
                carroceria = sc.nextInt();
                switch(carroceria){
                    case 0:
                        sc.close();
                        System.exit(0);
                    case 1:
                        carroceriaElegida = (Carroceria)fabricaCarroceria.getComponente("casual");
                        carroceriaElegida.creaCarroceria();
                        opcionCrear();
                        break;
                    case 2:
                        carroceriaElegida = (Carroceria)fabricaCarroceria.getComponente("deportiva");
                        carroceriaElegida.creaCarroceria();
                        opcionCrear();
                        break;
                    case 3:
                        carroceriaElegida = (Carroceria)fabricaCarroceria.getComponente("camion");
                        carroceriaElegida.creaCarroceria();
                        opcionCrear();
                        break;
                    default :
                        System.out.println("Opcion erronea digite la correcta");
                }
            } catch (InputMismatchException ime){
                System.err.println("\nOpcion incorrecta. ");
                System.exit(1);
                
            }
        } while (carroceria != 0);

    }




    public static void menuCreaMotor(){
        int motor = 0;

        do {
            System.out.printf("Seleccione un tipo de motor: \n" +
                              "1. deportivo\n" +
                              "2. simple\n" +
                              "3. diesel\n" +
                              "0. salir\n");
            try {
                motor = sc.nextInt();
                switch(motor){
                    case 0:
                        sc.close();
                        System.exit(0);
                    case 1:
                        motorElegido = (Motor)fabricaMotor.getComponente("deportivo");
                        motorElegido.creaMotor();
                        opcionCrear();
                        break;
                    case 2:
                        motorElegido= (Motor)fabricaMotor.getComponente("simple");
                        motorElegido.creaMotor();
                        opcionCrear();
                        break;
                    case 3:
                        motorElegido = (Motor)fabricaMotor.getComponente("diesel");
                        motorElegido.creaMotor();
                        opcionCrear();
                        break;
                    default :
                        System.out.println("\nOpcion erronea, digite la opcion correcta");
                }
            } catch (InputMismatchException ime){
                System.err.println("\nOpcion incorrecta. ");
                System.exit(1);
                
            }
        } while (motor != 0);

    } 




    public static void menuCreaBlindaje(){
        int blindaje = 0;

        do {
            System.out.printf("Seleccione un tipo de blindaje: \n" +
                              "1. simple\n" +
                              "2. reforzado\n" +
                              "3. tanque\n" +
                              "0. salir\n");
            try {
                blindaje = sc.nextInt();
                switch(blindaje){
                    case 0:
                        sc.close();
                        System.exit(0);
                    case 1:
                        blindajeElegido = (Blindaje)fabricaBlindaje.getComponente("simple");
                        blindajeElegido.creaBlindaje();
                        opcionCrear();
                        break;
                    case 2:
                        blindajeElegido = (Blindaje)fabricaBlindaje.getComponente("reforzado");
                        blindajeElegido.creaBlindaje();
                        opcionCrear();
                        break;
                    case 3:
                        blindajeElegido = (Blindaje)fabricaBlindaje.getComponente("tanque");
                        blindajeElegido.creaBlindaje();
                        opcionCrear();
                        break;
                    default :
                        System.out.println("\nOpcion incorrecta, digite la opcion correcta");
                }
            } catch (InputMismatchException ime){
                System.err.println("\nOpcion incorrecta. ");
                System.exit(1);
                
            }
        } while (blindaje != 0);

    }




    public static void menuCreaArma(){
        int arma = 0;

        do {
            System.out.printf("Seleccione un tipo de arma: \n" +
                              "1. Arpón\n" +
                              "2. Lanzallamas\n" +
                              "3. Lanza\n" +
                              "4. Sierra\n" +
                              "5. Metralleta\n" +
                              "0. Salir\n");
            try {
                arma = sc.nextInt();
                switch(arma){
                    case 0:
                        sc.close();
                        System.exit(0);
                    case 1:
                        armaElegida = (Arma)fabricaArmas.getComponente("Arpón");
                        armaElegida.creaArma();
                        opcionCrear();
                        break;
                    case 2:
                        armaElegida = (Arma)fabricaArmas.getComponente("Lanzallamas");
                        armaElegida.creaArma();
                        opcionCrear();
                        break;
                    case 3:
                        armaElegida = (Arma)fabricaArmas.getComponente("Lanza");
                        armaElegida.creaArma();
                        opcionCrear();
                        break;
                    case 4:
                        armaElegida = (Arma)fabricaArmas.getComponente("Sierra");
                        armaElegida.creaArma();
                        opcionCrear();
                        break;
                    case 5:
                        armaElegida = (Arma)fabricaArmas.getComponente("Metralleta");
                        armaElegida.creaArma();
                        opcionCrear();
                    default :
                        System.out.println("\nOpcion erronea, digite la opcion correcta");
                }
            } catch (InputMismatchException ime){
                System.err.println("\nOpcion incorrecta. ");
                System.exit(1);
                
            }
        } while (arma != 0);

    }


    public static void imprimeAutomovilCompleto(){
        
        Automovil autoNuevo = new Automovil(llantaElegida, motorElegido, carroceriaElegida, blindajeElegido, armaElegida);
        autoNuevo.muestraAutomovil();
        autoNuevo.muestraDefensa();
        autoNuevo.muestraAtaque();
        autoNuevo.muestraVelocidad();
        autoNuevo.muestraCostoTotal();

    }


   
}
