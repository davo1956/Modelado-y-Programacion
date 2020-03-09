import java.util.LinkedList;

/**
 * Clase que nos instancia un usuario de la plataforma de la que estemos utilizando.
 * el cliente esta conformado de un nombre, servicio a la que esta inscrito, dinero con el que cuenta para suscribir,
 * el tipo de plan o servicio que contrato y las recomendaciones que le estara haciendo la plataforma.
 */

public class Cliente implements InterfazObservador {
//nombre del cliente
    private String nombre;

//dinero con el que cuenta inicialmente el cliente
    private int dinero;

//Lista de recomendaciones que se sugerirán al cliente de la plataforma correspondiente.
    private LinkedList<String> recomendaciones;

//Servicio o app a la que esta suscrito el cliente.
    private LinkedList<Plataforma> servicioSuscrito;

//Tipo de servicio al que esta suscrito el cliente
    private LinkedList<Integer> tipoPlan;


    /**
     * Estado Inicial del Cliente.
     * @param nombre es el nombre del cliente
     * @param dinero es el dinero con el que cuenta la persona
     */

    public Cliente(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.recomendaciones = new LinkedList<String>();
        this.servicioSuscrito = new LinkedList<Plataforma>();
        this.tipoPlan = new LinkedList<Integer>();
    }

    /**
     * Regresa el nombre del cliente
     * @return nombre del cliente.
     */

    public String getNombre(){
        return nombre;
    }

    /**
     * Define el nombre del cliente.
     * @param nombre el nuevo nombre del cliente.
     */

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Regresa el dinero del cliente
     * @return dinero el dinero del cliente
     */

    public int getDinero(){
        return dinero;
    }

    /**
     * Define la cantidad de dinero del cliente a tratar
     * @param dinero el dinero de la persona
     */

    public void setDinero(int dinero){
        this.dinero = dinero;
    }

    /**
     * Regresa la lista de recomendaciones
     * @return recomendaciones
     */

    public LinkedList<String> getRecomendaciones(){
        return this.recomendaciones;
    }
    
    /**
     * Regresa la lista de Servicios suscritos
     * @return servicio Suscrito
     */
    public LinkedList<Plataforma> getServicioSuscrito(){
        return this.servicioSuscrito;
    }

    /**
     * Regresa el tipo de plan que fue seleccionado por el cliente
     * @return tipo de plan
     */

    public LinkedList<Integer> getTipoPlan(){
        return this.tipoPlan;
    }

    /**
     * Metodo update correspondiente de Observer.
     */

    @Override
    public void update(Plataforma plataforma){
        recomendaciones.add(plataforma.getRecomendacionDelDia());
        darRecomendacion(plataforma);
    }

    /**
     * Metodo que nos da la recomendacion diaria al cliente que se suscribe a la aplicacion.
     * @param p plataforma de la que se da la recomendación
     */

    public void darRecomendacion(Plataforma p){
        System.out.println(nombre + "por que no..." + p.getRecomendacionDelDia() + "solo en" + p.getNombre() + "\n ");   
    }

    public void suscribir(Plataforma plataforma, int plan){
        plataforma.agrega(this);
        getServicioSuscrito().add(plataforma);
        getTipoPlan().add(plan);
        plataforma.notificar();
        
    }

   // public void cobrar(Plataforma p, int plan){
     //   p.formaDePago(this, plan);
        
    //}

    public void cancelarSuscripcion(Plataforma p){
        p.borrar(this);
    }
    int n;
    

    /*public void simulacionPorDia(int dia){
        LinkedList<Plataforma> c = new LinkedList<Plataforma>(servicioSuscrito);
        for(Plataforma p : c){
            if(p.getUsuarios().contains(this)){
                
                n = this.getTipoPlan().get(n);
                p.formaDePago(this, n);
                this.update(p);
            }
        }
        this.getRecomendaciones().clear();
        System.out.println();
    }
    */

    



}