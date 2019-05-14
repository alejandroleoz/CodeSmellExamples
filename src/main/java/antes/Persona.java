package antes;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String provincia;
    private String localidad;
    private String calle;
    private int numero;
    private String rol; // puede ser "admin"/"user"/"guest"

    public Persona(){
        this.init();
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.init();
    }

    public Persona(String nombre, String apellido, Date fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.init();
    }

    private void init(){
        // supongamos que aca se hacen tareas de inicializacion ...
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

    /**
     * Setea el domicilio de la persona
     */
    public void setDomicilio(String provincia, String localidad, String calle, int numero) {
        this.provincia = provincia;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
    }

    /**
     * Imprime el domicilio de la persona
     */
    public void printDomicilio() {
        System.out.println(this.calle + " " + this.numero + " (" + this.localidad + ", " + this.provincia + ")");
    }

    /**
     * Devuelve el rol de la persona
     */
    public String getRol() {
        return rol;
    }

    /**
     * Setea el rol de la persona
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Chequea si la persona esta autorizada o no segun su rol y las politicas
     */
    public boolean estaAutorizado() {
        boolean result = false;

        switch (this.rol) {
            case "admin":
                // supongamos que aca hay una logica muy compleja
                result = true;
                break;
            case "user":
                // aca hay otra logica muy compleja
                result = true;
                break;
            case "guest":
                // y aca tambien
                result = false;
                break;
        }
        return result;
    }
}
