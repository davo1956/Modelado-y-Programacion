import java.util.Random;
import java.util.LinkedList;



public class Spotify extends Plataforma {

    LinkedList<String> recomendsacionSpotify = new LinkedList<String>();

    InterfazSpotifyCobrar cobro;

    /**
     * Constructor de la clase Spotify
     * usa super para referirse al constructor de Plataforma.
     */
    
     public Spotify(){
        super("Spotify");
    }

    /**
     * Metodo que me genera las recomendaciones del dia Aleatoriamente.
     */

    @Override
    public String recomendacionDiaria(){
        Random reco = new Random();
        int dia = reco.nextInt(4);
        recomendsacionSpotify.add("La Santa-Bad Bunny");
        recomendsacionSpotify.add("He renunciado a ti- José José");
        recomendsacionSpotify.add("Perfect- Ed Sheeran");
        recomendsacionSpotify.add("Y hubo Alguien- Marc Anthony");
        recomendsacionSpotify.add("Condenado para el millon- Paulo Londra");
        setRecomendacionDelDia(recomendsacionSpotify.get(dia));
        return recomendsacionSpotify.get(dia);
    }

    public void formaDePago(Cliente c, int p){
        //c.getTipoPlan();
        p = c.getTipoPlan().get(p);
        switch (p) {
            case 0:
                cobro = new SpotifyPago();
                cobro.spotifyCobro(c);
                break;
            case 1:
                cobro = new SpotifyGratis();
                cobro.spotifyCobro(c);
                break;
        
            default:
                System.out.println("Pruebe un metodo de pago, por favor.");
                break;
        }
        
        
    }

    

    
}