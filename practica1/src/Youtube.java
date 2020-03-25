import java.util.Random;
import java.util.LinkedList;


public class Youtube extends Plataforma {

    LinkedList<String> recomendacionYoutube = new LinkedList<String>();

    InterfazYoutubeCobrar cobro;

    /**
     * Constructor de la clase Youtube
     * usamos super para referimos al contructor de plataforma.
     */

    public Youtube(){
        super("Youtube");
    }

    /**
     * Metodo que genera las recomendaciones aleatorias
     */

    @Override
    public String recomendacionDiaria(){
        Random reco = new Random();
        int dia = reco.nextInt(4);
        recomendacionYoutube.add("Luisito Comunica");
        recomendacionYoutube.add("Werevertumorro");
        recomendacionYoutube.add("Topes de Gama");
        recomendacionYoutube.add("Julio Profe");
        recomendacionYoutube.add("Dj Mario");
        setRecomendacionDelDia(recomendacionYoutube.get(dia));
        return recomendacionYoutube.get(dia);
    }

    public void formaDePago(Cliente c, int p){
        p = c.getTipoPlan().get(p);
        switch (p) {
            case 0:
                cobro = new YoutubePremium();
                cobro.youtubeCobro(c);
                break;
            case 1:
                cobro = new YoutubeGratis();
                cobro.youtubeCobro(c);
                break;

            default:
                System.out.println("Pruebe un metodo de pago, por favor");
                break;

        }
    }
    
    
}