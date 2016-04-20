package despues;

public class Domicilio {
    private String provincia;
    private String localidad;
    private String calle;
    private int numero;

    public Domicilio(String provincia, String localidad, String calle, int numero) {
        this.provincia = provincia;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return this.calle + " " + this.numero + " (" + this.localidad + ", " + this.provincia + ")";
    }

    public void print() {
        System.out.println(this.toString());
    }
}
