import despues.Domicilio;
import despues.UserRol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        new Main().ejecutarAntes();
        new Main().ejecutarDespues();
    }

    /**
     * Ejecuta el demo antes de la refactorizacion
     */
    public void ejecutarAntes() {
        antes.Persona persona = new antes.Persona("Lionel", "Messi", createDate());
        persona.setDomicilio("Santa Fe", "Rosario", "Montoto", 1234);
        persona.setRol("user");
        System.out.println(persona.getNombre() + " " + persona.getApellido());
        persona.printDomicilio();
        System.out.println("Esta autorizado?? " + persona.estaAutorizado());
    }

    /**
     * Ejecuta el demo despues de la refactorizacion
     */
    public void ejecutarDespues() {
        despues.Persona persona = new despues.Persona("Lionel", "Messi", createDate());
        persona.setDomicilio(new Domicilio("Santa Fe", "Rosario", "Montoto", 1234));
        persona.setRol(new UserRol());
        System.out.println(persona.getNombre() + " " + persona.getApellido());
        persona.getDomicilio().print();
        System.out.println("Esta autorizado? " + persona.estaAutorizado());
    }

    public Date createDate() {
        Date result = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        try {
            result = formatter.parse("1987/06/24");
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

}
