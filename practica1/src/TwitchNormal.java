public class TwitchNormal extends Twitch implements InterfazTwitchCobrar {

    /**
     * Metod que se implementa para el cobro del servicio en version normal.
     */

    public void twitchPago(Cliente c){
        int pago = 6;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }
    
}