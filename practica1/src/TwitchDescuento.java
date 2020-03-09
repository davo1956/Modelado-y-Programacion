public class TwitchDescuento extends Twitch implements InterfazTwitchCobrar {

    /**
     * Metodo para verificar y dar el descuento
     */

    public void twitchPago(Cliente c){
        int pago = 3;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }

}