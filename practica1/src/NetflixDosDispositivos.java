public class NetflixDosDispositivos extends Netflix implements InterfazNetflixCobrar{
    
    /**
     * Metodo de Interfaz Netflix Cobro que nos implementa eñl metodo para cobrar 2 
     * dispositivos.
     */

    public void netflixCobro(Cliente c){
        int pago = 10;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }
}