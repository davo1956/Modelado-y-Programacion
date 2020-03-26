import java.util.Random;
import java.util.LinkedList;



public class Netflix extends Plataforma {

    LinkedList<String> recomendacionNetflix = new LinkedList<String>();

    InterfazNetflixCobrar cobro;

    /**
     * Constructor de la clase Netflix
     * usa super para referirse al constructor de la Clase Abstracta Plataforma.
     */

    public Netflix(){
        super("Netflix");
    }

    /**
     * Metodo que genera las recomendaciones del dia aleatorias
     */

    @Override
    public String recomendacionDiaria(){
        Random reco = new Random();
        int dia = reco.nextInt(4);
        recomendacionNetflix.add("Red Social");
        recomendacionNetflix.add("El aviso");
        recomendacionNetflix.add("Scream");
        recomendacionNetflix.add("You");
        recomendacionNetflix.add("Furia Ñera");
        setRecomendacionDelDia(recomendacionNetflix.get(dia));
        return recomendacionNetflix.get(dia);
    }

    public void formaDePago(Cliente c, int p){
        p = c.getTipoPlan().get(p);
        switch(p) {
            case 0:
                cobro = new NetflixUnDispositivo();
                cobro.netflixCobro(c);
                break;
            case 1:
                cobro = new NetflixDosDispositivos();
                cobro.netflixCobro(c);
                break;
            case 2:
                cobro = new NetflixCuatroDispositivos();
                cobro.netflixCobro(c);
                break;
            
            default:
                System.out.println("Pruebe un metodo de pago por favor");
                break;
        }
    }
    
}