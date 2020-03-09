public class SpotifyPago extends Spotify implements InterfazSpotifyCobrar {

    /**
     * Metodo implementado desde la Interfaz Spotify Cobrar para realizar el cobro
     * del servicio en su estado de premium.
     */

    public void spotifyCobro(Cliente c){
        int pago = 4;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);

    }


}