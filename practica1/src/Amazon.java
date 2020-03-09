import java.util.Random;
import java.util.LinkedList;



public class Amazon extends Plataforma {

    LinkedList<String> recomendacionAmazon = new LinkedList<String>();

    InterfazAmazonCobrar cobro;

    /**
     * Constructor de la clase Amazon 
     * usa super para referirse al constructor de plataforma
     */

    public Amazon(){
        super("Amazon");
    }

    /**
     * Metodo que genera las recomendaciones aleatorias
     */

    @Override
    public String recomendacionDiaria(){
        Random reco = new Random();
        int dia = reco.nextInt(4);
        recomendacionAmazon.add("Rango");
        recomendacionAmazon.add("El Joven Sheldon");
        recomendacionAmazon.add("Saw");
        recomendacionAmazon.add("Supernatural");
        recomendacionAmazon.add("La Teoria del Big Bang");
        setRecomendacionDelDia(recomendacionAmazon.get(dia));
        return recomendacionAmazon.get(dia);
    }

    public void formaDePago(Cliente c, int p){
        p = c.getTipoPlan().get(p);
        switch (p) {
            case 0:
                cobro = new AmazonPremium();
                cobro.amazonCobro(c);
                break;
            case 1:
                cobro = new AmazonNormal();
                cobro.amazonCobro(c);
                break;
        
            default:
            System.out.println("Pruebe otro metodo de pago, por favor");
            break;
        }
    }
    
    
}