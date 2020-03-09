 /**
  * Practica 1 de Modelado y Programación
  */


  public class Practica1 {
      
    public static void main(String[] args) {

        System.out.println("Inicio de Simulación....");



        Plataforma netflix = new Netflix();
        Plataforma spotify = new Spotify();
        Plataforma youtube = new Youtube();
        Plataforma amazon = new Amazon();
        Plataforma twitch = new Twitch();

        Cliente alicia = new Cliente("Alicia", 500);
        alicia.suscribir(netflix, 2);
        alicia.suscribir(spotify, 1);
        alicia.suscribir(youtube, 1);
        alicia.suscribir(amazon, 1);
        alicia.suscribir(twitch, 1);


        Cliente bob = new Cliente("Bob", 40);
        bob.suscribir(netflix, 2);
        bob.suscribir(spotify, 1);
        bob.suscribir(youtube, 1);
        bob.suscribir(amazon, 1);
        bob.suscribir(twitch, 1);
        
        
        Cliente cesar = new Cliente("Cesar", 40);
        cesar.suscribir(spotify, 1);
        cesar.suscribir(youtube, 0);

        Cliente diego = new Cliente("Diego", 180);
        diego.suscribir(netflix, 1);
        diego.suscribir(amazon, 1);

        Cliente erika = new Cliente("Erika", 300);
        erika.suscribir(netflix, 2);
        erika.suscribir(twitch, 0);
        erika.suscribir(spotify, 0);
        erika.suscribir(youtube, 0);


        for(int i = 1; 1<=5; i++){
          System.out.println("\nDía:" + 1);
          if(i == 2){
            diego.suscribir(twitch, 1);
            erika.suscribir(spotify, 1);
            erika.suscribir(youtube, 1);
          }
          if(i == 3){
            diego.suscribir(spotify, 0);
            diego.cancelarSuscripcion(netflix);
            erika.cancelarSuscripcion(netflix);
            erika.suscribir(amazon, 1);
          }
          if(i == 4){
            diego.suscribir(netflix, 2);
          }
          
          
        }
        
    }

  }
