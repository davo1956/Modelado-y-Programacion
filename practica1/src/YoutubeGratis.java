public class YoutubeGratis extends Youtube implements InterfazYoutubeCobrar{

    /**
     * Metodo de Interfaz para implementar el metodo de pago para Youtube gratis
     */

    public void youtubeCobro(Cliente c){
        int pago = 0;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }

}