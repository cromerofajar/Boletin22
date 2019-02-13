package boletin22;

/**
 *
 * @author cromerofajar
 */
public class Correos{
    String mensaje;
    boolean leido;

    public Correos() {
    }

    public Correos(String mensaje, boolean leido) {
        this.mensaje = mensaje;
        this.leido = leido;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean getLeido() {
        return leido;
    }

    @Override
    public String toString() {
        return "Mensaje= " + mensaje + "\nLeido=" + leido;
    }

}
