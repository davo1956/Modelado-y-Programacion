public class SpotifyGratis extends Spotify implements InterfazSpotifyCobrar{

    /**
     * Metodo de Interfaz Spotify Cobro que es implementado para cobrar el servicio gratuito.
     */

    public void spotifyCobro(Cliente c){
        int pago = 0;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }

}