public class AmazonNormal extends Amazon implements InterfazAmazonCobrar {

    /**
     * Metodo de Interfaz para implementar el pago para la version normal
     */

    public void amazonCobro(Cliente c){
        int pago = 7;
        int resto = c.getDinero() - pago;
        c.setDinero(resto);
    }
    
}