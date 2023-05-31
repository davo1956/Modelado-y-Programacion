import java.util.Scanner;
import java.util.InputMismatchException;

public class Practica3 {


    public static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args){


         
        int sw = 0;
        
         do {
             System.out.println("\nHola y sea Bienvenido a Baguettes WaySub con Las pizzas de Don Cangrejo\n");
             System.out.printf("Seleccione un número: \n" +
                               "1. Baguettes\n" +
                               "2. Pizzas\n" +
                               "0. Salir\n");
            try {
                sw = sc.nextInt();
                switch(sw) {
                    case 0: 
                        sc.close();
                        System.exit(0);
                    case 1:
                        opcionesBaguettes();
                        break;
                    case 2:
                        opcionesPizzas();
                        break;
                    default :
                        System.out.println("Opcion incorrecta, intente una valida.\n");
                }
            } catch (InputMismatchException ime){
                System.err.println("\nOpcion erronea. ");
                System.exit(1);
            }
        }  while(sw !=0);
    }
    
    
    
    
    public static void opcionesBaguettes(){
        int n = 0;
        do {
            System.out.printf("\nSeleccione un tipo de baguette: \n" +
                              "1. Clasico: $15\n" +
                              "2. Integral: $20\n" +
                              "0. Salir\n");
            try{
                n = sc.nextInt();
                System.out.println();
                switch(n) {
                    case 0 :
                        sc.close();
                        System.exit(0);
                    case 1 :
                        Baguette clasico = new BaguetteClasico();
                        condimentosBaguette(clasico);
                        break;
                    case 2 :
                        Baguette integral = new BaguetteIntegral();
                        condimentosBaguette(integral);
                        break;
                    default :
                        System.out.println("\nOPcion Erronea, ingrese la correcta");
                }
            } catch (InputMismatchException ime ) {
                System.err.println("\nOpcion erronea");
                System.exit(1);
            }
        } while(n != 0);

    }

    public static void condimentosBaguette(Baguette baguette){
        int cond = 0;
        do {
            System.out.printf("\n Seleccione sus condimentos de su baguette: \n" +
                              "1. Pollo: $25.00\n" +
                              "2. Pepperoni: $18.00\n" +
                              "3. Jamon: $15.00\n" +
                              "4. Lechuga: $5.00\n" +
                              "5. Jitomate: $8.00\n" +
                              "6. Cebolla: $5.00\n" +
                              "7. Mostaza: $10.00\n" +
                              "8. Catsup: $8.00\n" +
                              "9. Mayonesa: $7.00\n" +
                              "10. Imprime ticket\n" +
                              "0. Salir\n");
            try {
                cond = sc.nextInt();
                System.out.println();
                switch(cond) {
                    case 0 :
                        sc.close();
                        System.exit(0);
                    case 1:
                        baguette = new Pollo(baguette);
                        //condimentosBaguette(baguette);
                        //System.out.println(baguette.getDescripcion()+ " su total es: $" + baguette.getPrecio());
                        break;
                    case 2:
                        baguette = new Pepperoni(baguette);
                        //System.out.println(baguette.getDescripcion()+ " su total es: $" + baguette.getPrecio());
                        break;
                    case 3:
                        baguette = new Jamon(baguette);
                        break;
                    case 4:
                        baguette = new Lechuga(baguette);
                        break;
                    case 5: 
                        baguette = new Jitomate(baguette);
                        break;
                    case 6: 
                        baguette = new Cebolla(baguette);
                        break;
                    case 7: 
                        baguette = new Mostaza(baguette);
                        break;
                    case 8:
                        baguette = new Catsup(baguette);
                        break;
                    case 9: 
                        baguette = new Mayonesa(baguette);
                        break;
                    case 10:
                        System.out.println(baguette.getDescripcion()+ " su total es: $" + baguette.getPrecio());
                        break;
                    default :
                        System.out.println("Opcion erronea");
                }
            } catch (InputMismatchException ime) {
                System.err.println("\nOpcion erronea");
                System.exit(1);
            }
        } while (cond != 0);
    }
        
        
    public static void opcionesPizzas(){
        int p = 0;
        do {
            System.out.printf("\nSelecciona un tipo de pizza: \n" +
                              "1. Pizza de la casa: $160.00\n" +
                              "2. Pizza especial: $190.00\n" +
                              "3. Pizza sencilla: $175\n" +
                              "4. Pizza para todos: $170\n" +
                              "5. Pizza de Don Cangejo la mejor: $150\n" +
                              "0. Salir\n");
            try {
                p = sc.nextInt();
                System.out.println();
                switch(p) {
                    case 0:
                        sc.close();
                        System.exit(0);
                    case 1:
                        Pizza pizza1 = new Pizza1();
                        Baguette bag = new PizzaAdapter(pizza1);
                        System.out.println("Su pizza es: " + bag.getDescripcion() + "total: $" + bag.getPrecio());
                        sc.close();
                        System.exit(0);
                    case 2:
                        Pizza pizza2 = new Pizza2();
                        Baguette bag2 = new PizzaAdapter(pizza2);
                        System.out.println("Su pizza es: " + bag2.getDescripcion() + "total: $" + bag2.getPrecio());
                        sc.close();
                        System.exit(0);
                    case 3:
                        Pizza pizza3 = new Pizza3();
                        Baguette bag3 = new PizzaAdapter(pizza3);
                        System.out.println("Su pizza es: " + bag3.getDescripcion() + "total: $" + bag3.getPrecio());
                        sc.close();
                        System.exit(0);
                    case 4:
                        Pizza pizza4 = new Pizza4();
                        Baguette bag4 = new PizzaAdapter(pizza4);
                        System.out.println("Su pizza es: " + bag4.getDescripcion() + "total: $" + bag4.getPrecio());
                        sc.close();
                        System.exit(0);
                    case 5: 
                        Pizza pizza5 = new Pizza5();
                        Baguette bag5 = new PizzaAdapter(pizza5);
                        System.out.println("Su pizza es: " + bag5.getDescripcion() + "total: $" + bag5.getPrecio());
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Opcion erronea");
                }
            } catch (InputMismatchException ime) {
                System.err.println("\nOpcion erronea");
                System.exit(1);
            }
        } while (p != 0);
    }
                       
}
