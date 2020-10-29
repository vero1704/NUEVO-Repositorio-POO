package Entidades;

/**
 *
 * @author Veronica Quesada
 */
public class Familia {
    public String Apellido;
    public Ubicacion ubicacion;

    public Familia(String Apellido, Ubicacion ubicacion) {
        this.Apellido = Apellido;
        this.ubicacion = ubicacion;
    }

    public Familia() {
    }

    public Familia(String Apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
}
