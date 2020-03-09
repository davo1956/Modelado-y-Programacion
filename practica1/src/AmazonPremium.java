public class AmazonPremium extends Amazon implements InterfazAmazonCobrar {

    /**
     * Metodo de Interfaz para Amazon de cobro del servicio Premium
     */

    public void amazonCobro(Cliente c){
        int pago = 13;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }
    
}