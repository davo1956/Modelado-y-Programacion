import java.util.LinkedList;

/**
 *  Clse Plataforma es la clase abstracta que implementa los metodos generales de pago, bievenida, notificacion 
 * correspondientes a las aplicaciones seleccionadas por el ususario, 
 */

public abstract class Plataforma implements InterfazGeneral{

//nombre de plataforma.

    protected String nombre;

// recomendacion del dia    

    String recomendacionDelDia;

//Lista de usuarios de la aplicacion.

    private LinkedList<Cliente> usuarios;


    /**
     * Estado inicial de cada plataforma
     * @param nombre es el nombre de la plataforma
     */
    public Plataforma(String nombre){
        this.nombre = nombre;
        usuarios = new LinkedList<Cliente>();
    }

    /**
     * Regresa el nombre de la app
     * @return nombre el nombre de la app
     */

    public String getNombre(){
        return nombre;
    }

    /**Define el nombre de la app
     * @param nombre el nombre de la app
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Regresa la lista de usuarios o subcriptores
     * @return LinkedList<Cliente> la lista de usuarios
     */
    public LinkedList<Cliente> getUsuarios(){
        return usuarios;
    }

    /**Define la recomendacion del dia
     * @param recomendacion es la recomendacion del dia 
     */

    public void setRecomendacionDelDia(String recomendacion){
        this.recomendacionDelDia = recomendacion;
    }

    /**
     * Regresa la recomendacion del dia
     * @return recomendacion es la recomendacion del dia.
     */
    public String getRecomendacionDelDia(){
        return recomendacionDelDia;
    }

    public void agrega(Cliente c){
        usuarios.add(c);
        bienvenida(c);
    }

    public void borrar(Cliente c){
        usuarios.remove(c);
        System.out.println("No te vayas" + c.getNombre() + "fue un gusto estsr a tu lado \n");
    }

    public void bienvenida(Cliente c){
        System.out.println("Bienvenido " + c.getNombre() + "a" + this.getNombre() +". \n");

    }

    public abstract String recomendacionDiaria();

    public abstract void formaDePago(Cliente c, int p);

    //public abstract int planPlataforma();

    public void notificar(){
        for(Cliente c : usuarios){
            c.update(this);
        }
    }


}