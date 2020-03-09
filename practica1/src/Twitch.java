import java.util.Random;
import java.util.LinkedList;



public class Twitch extends Plataforma {

    LinkedList<String> recomendacionTwitch = new LinkedList<String>();

    InterfazTwitchCobrar cobro;

    /**
     * Constructor de la clase Twitch
     * usa super para referirse al construcrtor de PLateforma.
     */

    public Twitch(){
        super("Twitch");
    }

    /**
     * Metodo que genera las recomendaciones aleatorias.
     */

    @Override
    public String recomendacionDiaria(){
        Random reco = new Random();
        int dia = reco.nextInt(4);
        recomendacionTwitch.add("Dalticos");
        recomendacionTwitch.add("W2M Crew");
        recomendacionTwitch.add("Vegeta 777");
        recomendacionTwitch.add("Auron Play");
        recomendacionTwitch.add("Fortnite live");
        setRecomendacionDelDia(recomendacionTwitch.get(dia));
        return recomendacionTwitch.get(dia);
    }


    public void formaDePago(Cliente c, int p){
        p = c.getTipoPlan().get(p);
        switch (p) {
            case 0:
                cobro = new TwitchNormal();
                cobro.twitchPago(c);
                break;
            case 1:
                cobro = new TwitchDescuento();
                cobro.twitchPago(c);
                break;

            default:
                System.out.println("Pruebe un metodo de pago, por favor");
                break;
        }
    }
    

    
} 