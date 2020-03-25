public class NetflixCuatroDispositivos extends Netflix implements InterfazNetflixCobrar{

    /**
     * Metodo de Interfaz Netflix que nos cobrará el servicio para 4 pantallas
     */


    public void netflixCobro(Cliente c){
        int pago = 15;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }
    
}