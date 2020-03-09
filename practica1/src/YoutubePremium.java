public class YoutubePremium extends Youtube implements InterfazYoutubeCobrar{

    /**
     * Metodo para el cobro del servicio de youtube premium
     */

    public void youtubeCobro(Cliente c){
        int pago = 6;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }

}