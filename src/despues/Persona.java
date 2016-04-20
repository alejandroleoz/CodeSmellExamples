package despues;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    /* ***  esto NO es propio de la persona.. tiene sentido persona.getLocalidad() ??
    private String provincia;
    private String localidad;
    private String calle;
    private int numero;
    *******************************************************/

    // defino atributo de tipo Domicilio
    private Domicilio domicilio;

    // defino atributo de tipo Rol
    private Rol rol;



    public Persona(){
        this.init();
    }

    public Persona(String nombre, String apellido){

        // llamo al otro constructor para no repetir el init();
        this();

        this.nombre = nombre;
        this.apellido = apellido;

        /* ** ACA SE REPITE CODIGO *******
        this.init();
        *******************************/
    }

    public Persona(String nombre, String apellido, Date fechaNacimiento){

        // llamo al otro constructor para no repetir las asignaciones
        this(nombre, apellido);

        this.fechaNacimiento = fechaNacimiento;

        /* ****** ACA SE REPITE CODIGO ************
        this.nombre = nombre;
        this.apellido = apellido;
        this.init();
        *******************************************/
    }

    private void init(){
        // supongamos que aca se hacen tareas de inicializacion ...
        this.rol = new NullRol();
    }

    /**
     * Devuelve el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /* *** CAMBIO LA IMPLEMENTACION -> CREO CLASE "Domicilio" **************
    public void setDomicilio(String provincia, String localidad, String calle, int numero) {
        this.provincia = provincia;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
    }
    *********************************************************/

    // ------------ CREO getter / setter DE DOMICILIO --------------

    /**
     * Devuelve el domicilio de la persona
     * @return
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * Setea domicilio de la persona
     * @param domicilio
     */
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    /* ****** ESTO ES CODIGO MUERTO... usar persona.getDomicilio().print()
    public void printDomicilio() {
        System.out.println(this.calle + " " + this.numero + " (" + this.localidad + ", " + this.provincia + ")");
    }
    *********************************************************************/


    // ------------------------------------------------------

    /**
     * Devuelve el rol de la persona
     * @return
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * Setea el rol de la persona
     * @param rol
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    /**
     * Chequea si la persona esta autorizada o no segun su rol y las politicas
     */
    public boolean estaAutorizado() {

        // ahora DELEGO en el objeto Rol que este seteado -> Strategy pattern
        // Que pasa si rol == null? -> NullObject pattern

        return this.rol.estaAutorizado(this);
    }
}

