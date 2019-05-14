package despues;

public class NullRol implements Rol {

    public boolean estaAutorizado(Persona persona) {
        return false;
    }
}
