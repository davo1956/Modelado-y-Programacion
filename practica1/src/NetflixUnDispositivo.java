public class NetflixUnDispositivo extends Netflix implements InterfazNetflixCobrar{

    /**
     * Metodo de la Interfaz Netflix cobro que es implementado para cobrar un dispositivo.
     */

    public void netflixCobro(Cliente c){
        int pago = 7;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }
    
}